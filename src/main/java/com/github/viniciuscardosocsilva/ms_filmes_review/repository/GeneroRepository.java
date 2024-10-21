package com.github.viniciuscardosocsilva.ms_filmes_review.repository;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
}
