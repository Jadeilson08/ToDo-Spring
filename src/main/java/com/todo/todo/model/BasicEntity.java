package com.todo.todo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@MappedSuperclass
public abstract class BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDate created;
    @Column(name = "updated")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDate updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicEntity that = (BasicEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
