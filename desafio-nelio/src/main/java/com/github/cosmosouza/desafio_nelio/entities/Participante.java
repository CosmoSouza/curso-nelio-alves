package com.github.cosmosouza.desafio_nelio.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Participante {

    @Setter
    @Getter
    @Id
    @GeneratedValue
    private Integer id;

    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private String email;


    @ManyToMany(mappedBy = "participantes")
    private Set<Atividade> atividades = new HashSet<>();

    public Participante() {

    }

    public Participante(Integer id, String name, String email, Atividade atividade) {
        this.id = id;
        this.name = name;
        this.email = email;

    }

}
