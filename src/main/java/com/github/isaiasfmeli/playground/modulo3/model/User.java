package com.github.isaiasfmeli.playground.modulo3.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.jackson.JsonComponent;

@Data
@JsonComponent
public class User {

    int id;
    String name;

}
