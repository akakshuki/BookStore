package bookStore.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookStore.models.Users;

@Repository
public interface IUsersRepository extends JpaRepository<Users, Integer>{
	
}
