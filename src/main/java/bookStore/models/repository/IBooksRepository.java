package bookStore.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookStore.models.Books;

@Repository
public interface IBooksRepository extends JpaRepository<Books, Integer>{
	
}
