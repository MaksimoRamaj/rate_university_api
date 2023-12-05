package com.app.rateuniversityapplicationapi.repository;

import com.app.rateuniversityapplicationapi.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ReviewRepository extends JpaRepository<Review, UUID> {

    @Query(value = "SELECT u FROM Review u WHERE u.user.id = ?1")
    List<Review> findReviewByUserUUID(UUID uuid);

}
