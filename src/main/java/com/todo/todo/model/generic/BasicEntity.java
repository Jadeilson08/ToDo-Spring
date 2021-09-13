package com.todo.todo.model.generic;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EqualsAndHashCode
public abstract class BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    protected Long id;

    @Column(name = "created")
    @CreatedDate
    @EqualsAndHashCode.Exclude
    @Getter
    @Setter
    protected Date created;
    
    @Column(name = "updated")
    @LastModifiedDate
    @EqualsAndHashCode.Exclude
    @Getter
    @Setter
    protected Date updated;

}
