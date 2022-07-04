package com.github.isaiasfmeli.playground.modulo3.dto;

import com.github.isaiasfmeli.playground.modulo3.model.User;

public class UserDto {
    String name;

    public UserDto(User user)
    {
        this.name = user.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
