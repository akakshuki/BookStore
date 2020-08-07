package bookStore.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookStore.models.Usertypes;

@Repository
public interface IUsertypesRepository extends JpaRepository<Usertypes, Integer>{

}
