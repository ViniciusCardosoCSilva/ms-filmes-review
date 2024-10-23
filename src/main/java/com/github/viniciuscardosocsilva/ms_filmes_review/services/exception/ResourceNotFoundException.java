package com.github.viniciuscardosocsilva.ms_filmes_review.services.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }

}
