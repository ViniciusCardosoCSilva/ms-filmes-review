package com.github.viniciuscardosocsilva.ms_filmes_review.controller.handler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

//    @ExceptionHandler(ResourceNotFoundException.class) //nossa classe
//    public ResponseEntity<CustomErrorDTO> resourceNotFound(ResourceNotFoundException exception,
//                                                           HttpServletRequest request) {
//
//        HttpStatus status = HttpStatus.NOT_FOUND;
//
//        CustomErrorDTO errorDTO = new CustomErrorDTO(Instant.now().toString(),
//                status.value(), exception.getMessage(), request.getRequestURI());
//        return ResponseEntity.status(status).body(errorDTO);
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<CustomErrorDTO> methodArgumentNotValidation(MethodArgumentNotValidException e, HttpServletRequest request) {
//        HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
//        ValidationErrorDTO err = new ValidationErrorDTO(Instant.now().toString(),
//                status.value(), "Dados inválidos", request.getRequestURI());
//        for (FieldError f : e.getBindingResult().getFieldErrors()) {
//            err.addError(f.getField(), f.getDefaultMessage());
//        }
//        return ResponseEntity.status(status).body(err);
//    }
//
//    @ExceptionHandler(DatabaseException.class)
//    public ResponseEntity<CustomErrorDTO> databaseException(DatabaseException e,
//                                                            HttpServletRequest request) {
//        HttpStatus status = HttpStatus.BAD_REQUEST;
//        CustomErrorDTO err = new CustomErrorDTO(Instant.now().toString(),
//                status.value(), e.getMessage(), request.getRequestURI());
//        return ResponseEntity.status(status).body(err);
//    }
//
//    @ExceptionHandler(HandlerMethodValidationException.class)
//    public ResponseEntity<CustomErrorDTO> handlerMethodValidation(HandlerMethodValidationException e,
//                                                                  HttpServletRequest request) {
//        HttpStatus status = HttpStatus.BAD_REQUEST;
//        CustomErrorDTO err = new CustomErrorDTO(Instant.now().toString(),
//                status.value(), "Falha na validação dos dados", request.getRequestURI());
//        return ResponseEntity.status(status).body(err);
//    }


}