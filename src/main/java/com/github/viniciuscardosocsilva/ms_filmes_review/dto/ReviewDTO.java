package com.github.viniciuscardosocsilva.ms_filmes_review.dto;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.Review;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ReviewDTO {

    private Long id;

    @NotNull(message = "Campo requerido")
    private String texto;

    private UserDTO user;

    public ReviewDTO(Review entity){

        this.id = getId();
        this.texto = getTexto();
        this.user = new UserDTO(entity.getUser());


    }
}
