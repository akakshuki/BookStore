package bookStore.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookStore.models.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer>{

}
