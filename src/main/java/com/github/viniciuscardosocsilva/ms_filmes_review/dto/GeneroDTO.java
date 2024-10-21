package com.github.viniciuscardosocsilva.ms_filmes_review.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GeneroDTO {

    private Long id;

    @NotNull(message = "Campo requerido")
    private String nome;

}
