package com.github.viniciuscardosocsilva.ms_filmes_review.repository;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
