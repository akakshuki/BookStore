package bookStore.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookStore.models.Orderdetail;

@Repository
public interface IOrderdetailRepository extends JpaRepository<Orderdetail, Integer>{

}
