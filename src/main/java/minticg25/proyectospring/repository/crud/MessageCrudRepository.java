package minticg25.proyectospring.repository.crud;

import org.springframework.data.repository.CrudRepository;

import minticg25.proyectospring.model.Message;

public interface MessageCrudRepository extends CrudRepository <Message,Integer> {
    
}
