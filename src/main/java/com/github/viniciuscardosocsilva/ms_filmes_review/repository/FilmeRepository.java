package com.github.viniciuscardosocsilva.ms_filmes_review.repository;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
