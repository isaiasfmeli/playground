package com.github.isaiasfmeli.playground.modulo7.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import java.time.*;
import javax.persistence.*;

@Data
@Entity
public class Movies {
    // id - int UN AI PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //created_at - timestamp
    private LocalDateTime created_at;
    //updated_at - timestamp
    private LocalDateTime updated_at;
    //title - varchar(500)
    private String title;
    //rating - decimal(3,1) UN
    private Double rating;
    //awards - int UN
    private Integer awards;
    //release_date - datetime
    private LocalDateTime release_date;
    //length - int UN
    private Integer length;
    //genre_id - int UN
    @OneToOne
    @JoinColumn(name = "genre_id")
    //@OneToOne(mappedBy = "author")
    @JsonIgnoreProperties({"exemplo", "teste"}) // ignorar este dado
    private Genres genre;
}
