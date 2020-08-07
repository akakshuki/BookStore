package bookStore.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookStore.models.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Integer>{

}
