package com.github.isaiasfmeli.playground.modulo7.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "email", length = 80, nullable = false, unique = true)
    private String email;
    @Column(name = "password", length = 80, nullable = false)
    private String password;
}
