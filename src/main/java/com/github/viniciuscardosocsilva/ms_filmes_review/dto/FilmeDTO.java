package com.github.viniciuscardosocsilva.ms_filmes_review.dto;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.Filme;
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

public class FilmeDTO {

    private Long id;

    @NotNull(message = "Campo requerido")
    private String titulo;

    @NotNull(message = "Campo requerido")
    private Integer ano;

    private GeneroDTO genero;

    private List<ReviewDTO> reviews = new ArrayList<>();

    public FilmeDTO(Filme entity){

        this.id = entity.getId();
        this.titulo = entity.getTitulo();
        this.ano = entity.getAno();
        this.genero = new GeneroDTO(entity.getGenero());
        entity.getReviews().forEach(review -> reviews.add(new ReviewDTO(review)));

    }


}
