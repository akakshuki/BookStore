package bookStore.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookStore.models.Cart;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer>{

}
