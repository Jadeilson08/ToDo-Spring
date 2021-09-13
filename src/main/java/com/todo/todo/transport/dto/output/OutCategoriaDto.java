package com.todo.todo.transport.dto.output;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutCategoriaDto {

    private String titulo;
    private String descricao;
    private Date created;
    private Date updated;

}
