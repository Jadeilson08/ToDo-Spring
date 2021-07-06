package com.todo.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Categoria extends BasicEntity {

    @Column(name = "titulo", nullable = false, length = 30)
    private String titulo;

    @Column(name = "descricao", nullable = true, length = 255)
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
