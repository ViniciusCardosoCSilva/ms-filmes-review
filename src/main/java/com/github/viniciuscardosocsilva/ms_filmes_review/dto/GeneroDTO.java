package com.github.viniciuscardosocsilva.ms_filmes_review.dto;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.Genero;
import com.github.viniciuscardosocsilva.ms_filmes_review.model.Review;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GeneroDTO {

    private Long id;

    @NotNull(message = "Campo requerido")
    private String nome;

    private List<FilmeDTO> filmes = new ArrayList<>();

    public GeneroDTO(Genero entity){

        this.id = entity.getId();
        this.nome = entity.getNome();
        //entity.getFilmes().forEach(filme -> filmes.add(new FilmeDTO(filme)));

    }
}
