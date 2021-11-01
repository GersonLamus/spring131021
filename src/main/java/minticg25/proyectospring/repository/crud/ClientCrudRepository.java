package minticg25.proyectospring.repository.crud;
import org.springframework.data.repository.CrudRepository;

import minticg25.proyectospring.model.Client;

public interface ClientCrudRepository extends CrudRepository <Client,Integer> {
    
}
