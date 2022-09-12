package com.github.isaiasfmeli.playground.modulo7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import java.time.*;
import javax.persistence.*;

@Data
@Entity
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String title;
    private Double rating;
    private Integer awards;
    private LocalDateTime release_date;
    private Integer length;

    @OneToOne
    @JoinColumn(name = "genre_id")
    //@OneToOne(mappedBy = "author")
    @JsonIgnoreProperties({"exemplo", "teste"}) // ignorar este dado
    private Genres genre;
}
