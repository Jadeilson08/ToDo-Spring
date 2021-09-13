package com.todo.todo.services.interfaces;

import java.util.List;

import com.todo.todo.model.Categoria;
import com.todo.todo.transport.dto.input.InpCategoriaDto;
import com.todo.todo.transport.dto.output.OutCategoriaDto;

public interface CategoriaService {
    public List<OutCategoriaDto> getCategorias();

    public Categoria newCategoria(InpCategoriaDto categoriaDto);
}
