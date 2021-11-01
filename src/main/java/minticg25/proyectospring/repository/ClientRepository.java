package minticg25.proyectospring.repository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import minticg25.proyectospring.model.Client;
import minticg25.proyectospring.repository.crud.ClientCrudRepository;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    
    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }

    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public Client save(Client c){
        return clientCrudRepository.save(c);
    }

    public void delete(Client client){
        clientCrudRepository.delete(client);
    }
    
}
