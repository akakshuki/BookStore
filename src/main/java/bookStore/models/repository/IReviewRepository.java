package bookStore.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bookStore.models.Review;

@Repository
public interface IReviewRepository extends JpaRepository<Review, Integer>{

}
