package com.github.isaiasfmeli.playground.modulo3.model;

import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class User {

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static User builder(String name)
    {
        User user = new User();
        user.setName(name);
        return user;
    }
}
