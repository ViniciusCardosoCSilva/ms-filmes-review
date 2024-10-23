package com.github.viniciuscardosocsilva.ms_filmes_review.dto;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.Review;

public class ReviewDTOSemFilme {

    private Long id;

    private String texto;

    private UserDTO user;

    private Long filmeId;

    public ReviewDTOSemFilme(Review entity) {

        this.id = entity.getId();
        this.texto = entity.getTexto();
        this.user = new UserDTO(entity.getUser());
        this.filmeId = entity.getFilme().getId();

    }

}
