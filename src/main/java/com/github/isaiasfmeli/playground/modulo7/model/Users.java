package com.github.isaiasfmeli.playground.modulo7.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.time.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users") // exemplo customização nome de tabela
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
    @JsonProperty("token")
    private String remember_token;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
