package com.todo.todo.controller;

import java.util.List;

import com.todo.todo.model.Categoria;
import com.todo.todo.services.interfaces.CategoriaService;
import com.todo.todo.transport.dto.input.InpCategoriaDto;
import com.todo.todo.transport.dto.output.OutCategoriaDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping("")
    public ResponseEntity<List<OutCategoriaDto>> get(){
        List<OutCategoriaDto> categorias = categoriaService.getCategorias();
        return ResponseEntity.ok(categorias);
    }

    @PostMapping("")
    public ResponseEntity post(@RequestBody InpCategoriaDto categoriaDto){

        Categoria categoria = categoriaService.newCategoria(categoriaDto);

        return ResponseEntity.ok(categoria);
        
        //return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
