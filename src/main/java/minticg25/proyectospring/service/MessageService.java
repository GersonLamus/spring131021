package minticg25.proyectospring.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import minticg25.proyectospring.model.Message;
import minticg25.proyectospring.repository.MessageRepository;

@Service
public class MessageService {
     
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();
    }
    
    public Optional<Message> getMessage(int id){
        return messageRepository.getMessage(id);
    }

    public Message save(Message m){
        if(m.getIdMessage()==null){
            return messageRepository.save(m);
        }else{
            //Valida si el Id existe, si es vacío no existe y lo guarda
            Optional<Message> maux=messageRepository.getMessage(m.getIdMessage());
            if (maux.isEmpty()){
                return messageRepository.save(m);
            }else{
                return m;
            }
        }
    }
    
    public Message update(Message message) {
        if (message.getIdMessage()!= null) {
            Optional<Message> e = messageRepository.getMessage(message.getIdMessage());
            if (!e.isEmpty()) {
                if (message.getMessageText()!= null) {
                    e.get().setMessageText(message.getMessageText());
                }
                messageRepository.save(e.get());
                return e.get();

            } else {
                return message;
            }
        } else {
            return message;
        }
    }

    public boolean deleteMessage(int id){
        Boolean aBoolean=getMessage(id).map(message -> {
            messageRepository.delete(message);
            return true;
        }).orElse(false);
        return aBoolean;
    }

}
