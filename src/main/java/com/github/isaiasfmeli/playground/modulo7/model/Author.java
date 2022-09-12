package com.github.isaiasfmeli.playground.modulo7.model;

import lombok.*;

import javax.persistence.Id;

@Getter @Setter
public class Author {
    @Id
    private int id;
    private String name;
}
