package minticg25.proyectospring.repository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import minticg25.proyectospring.model.Category;
import minticg25.proyectospring.repository.crud.CategoryCrudRepository;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;
    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public Category save(Category k){
        return categoryCrudRepository.save(k);
    }

    public void delete(Category category){
        categoryCrudRepository.delete(category);
    }

}
