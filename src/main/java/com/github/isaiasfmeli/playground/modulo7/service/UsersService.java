package com.github.isaiasfmeli.playground.modulo7.service;

import com.github.isaiasfmeli.playground.modulo7.model.Users;
import com.github.isaiasfmeli.playground.modulo7.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repo;

    public List<Users> findAll() {
        return repo.findAll();
    }

    public Optional<Users> findById(long id) {
        return repo.findById(id);
    }

    public Users create(Users user) {
        return repo.save(user);
    }

    public Users update(Users user) {
        return create(user);
    }

    public void delete(Users user) {
        repo.delete(user);
    }
}
