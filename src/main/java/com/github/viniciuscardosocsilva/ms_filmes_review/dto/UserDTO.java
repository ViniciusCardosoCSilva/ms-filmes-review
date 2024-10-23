package com.github.viniciuscardosocsilva.ms_filmes_review.dto;

import com.github.viniciuscardosocsilva.ms_filmes_review.model.Review;
import com.github.viniciuscardosocsilva.ms_filmes_review.model.User;
import jakarta.validation.constraints.Email;
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

public class UserDTO {

    private Long id;

    @NotNull(message = "Campo requerido")
    private String name;

    @Email(message = "Email requerido")
    private String email;

    @NotNull(message = "Campo requerido")
    private String password;

    private List<ReviewDTO> reviews = new ArrayList<>();

    public UserDTO(User entity){

        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        //entity.getReviews().forEach(review -> reviews.add(new ReviewDTO(review)));
    }
}
