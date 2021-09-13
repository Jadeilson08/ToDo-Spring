package com.todo.todo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.todo.todo.model.Categoria;
import com.todo.todo.repositories.CategoriaRepository;
import com.todo.todo.services.interfaces.CategoriaService;
import com.todo.todo.transport.dto.input.InpCategoriaDto;
import com.todo.todo.transport.dto.output.OutCategoriaDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<OutCategoriaDto> getCategorias() {
        Stream<Categoria> categorias = categoriaRepository.findAll().stream();

        List<OutCategoriaDto> outCategoriaDtos = categorias.map(categoria -> {
            return getCategoriaDto(categoria);
        }).collect(Collectors.toList());

        return outCategoriaDtos;
    }

    @Override
    public Categoria newCategoria(InpCategoriaDto categoriaDto) {
        Categoria categoria = new Categoria();
        categoria.setDescricao(categoriaDto.getDescricao());
        categoria.setTitulo(categoriaDto.getTitulo());

        return categoriaRepository.save(categoria);
    }

    private OutCategoriaDto getCategoriaDto(Categoria categoria) {
        OutCategoriaDto outCategoriaDto = new OutCategoriaDto();
        outCategoriaDto.setDescricao(categoria.getDescricao());
        outCategoriaDto.setTitulo(categoria.getTitulo());
        outCategoriaDto.setCreated(categoria.getCreated());
        outCategoriaDto.setUpdated(categoria.getUpdated());

        return outCategoriaDto;
    }

}
