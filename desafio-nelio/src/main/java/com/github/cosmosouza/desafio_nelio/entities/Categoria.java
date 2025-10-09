package com.github.cosmosouza.desafio_nelio.entities;

import jakarta.persistence.*;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Categoria {

    @Setter
    @Id
    @GeneratedValue
    private Integer id;

    @Setter
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Atividade> atividades = new ArrayList<>();

    public Categoria() {

    }

    public Categoria(Integer id, String descricao, List<Atividade> atividades) {
        this.id = id;
        this.descricao = descricao;
        this.atividades = atividades;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}
