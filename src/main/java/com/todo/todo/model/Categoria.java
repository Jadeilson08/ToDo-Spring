package com.todo.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.todo.todo.model.generic.BasicEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria extends BasicEntity {

    @Column(name = "titulo", nullable = false, length = 30)
    private String titulo;

    @Column(name = "descricao", nullable = true, length = 255)
    private String descricao; 
}
