package com.github.viniciuscardosocsilva.ms_filmes_review.services;

import com.github.viniciuscardosocsilva.ms_filmes_review.dto.FilmeDTO;
import com.github.viniciuscardosocsilva.ms_filmes_review.model.Filme;
import com.github.viniciuscardosocsilva.ms_filmes_review.repository.FilmeRepository;
import com.github.viniciuscardosocsilva.ms_filmes_review.repository.GeneroRepository;
import com.github.viniciuscardosocsilva.ms_filmes_review.services.exception.ResourceNotFoundException;
import org.hibernate.cache.spi.support.CollectionReadOnlyAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    @Autowired
    private GeneroRepository generoRepository;

    @Transactional(readOnly = true)
    public List<FilmeDTO> findAll(){
        return repository.findAll().stream().map(FilmeDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public FilmeDTO findById(Long id){
        Filme filme = repository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Recurso não encontrado: " + id)
        );
        return new FilmeDTO(filme);
    }

    @Transactional
    public FilmeDTO update(FilmeDTO dto){
        Filme filme = repository.getReferenceById(dto.getId());
    }

    private void copyDtoToEntity(FilmeDTO dto, Filme filme){
        filme.setTitulo(dto.getTitulo());
        filme.setAno(dto.getAno());
        filme.setGenero(generoRepository.findAllById(dto.getGeneroId()).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado: " + dto.getGeneroId())
        ));
    }

}
