package com.github.viniciuscardosocsilva.ms_filmes_review.repository;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
