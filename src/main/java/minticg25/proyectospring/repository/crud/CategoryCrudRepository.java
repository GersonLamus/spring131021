package minticg25.proyectospring.repository.crud;
import org.springframework.data.repository.CrudRepository;

import minticg25.proyectospring.model.Category;


public interface CategoryCrudRepository extends CrudRepository <Category,Integer> {
    
}
