package com.github.isaiasfmeli.playground.modulo3.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.isaiasfmeli.playground.modulo3.exception.NotFoundException;
import com.github.isaiasfmeli.playground.modulo3.model.User;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private final String linkFile = "src/main/resources/users.json";

    public UserRepository()
    {
    }

    public List<User> getUsers()
    {
        ObjectMapper mapper = new ObjectMapper();
        List<User> lista = new ArrayList<>();
        try {
            lista = Arrays.asList(mapper.readValue(new File(linkFile), User[].class));
        } catch (Exception ex){
        }
        return lista;
    }

    public User saveUser(User user)
    {
        ObjectMapper mapper = new ObjectMapper();
        List<User> lista = this.getUsers();
        try {
            List<User> listSave = new ArrayList<>(lista);
            listSave.add(user);
            mapper.writeValue(new File(linkFile), listSave);
        } catch (Exception ex) {
        }
        return user;
    }

    public Optional<User> getUser(String name)
    {
        for(User user : this.getUsers())
        {
            if(user.getName().equals(name))
            {
                return Optional.of(user);
            }
        }
        throw new NotFoundException("usuário não encontrado");
    }

}
