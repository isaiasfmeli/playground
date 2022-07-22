package com.github.isaiasfmeli.playground.modulo7.service;

import com.github.isaiasfmeli.playground.modulo7.exception.BadRequestException;
import com.github.isaiasfmeli.playground.modulo7.model.Users;
import com.github.isaiasfmeli.playground.modulo7.repository.UsersRepository;
import org.springframework.beans.ConfigurablePropertyAccessor;
import org.springframework.beans.NotWritablePropertyException;
import org.springframework.beans.PropertyAccessorFactory;
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

    public Optional<Users> updatePartial(long id, Map<String, String> changes) {
        Optional<Users> userFound = findById(id);
        if (userFound.isPresent()) {
            ConfigurablePropertyAccessor propertyAccessor = PropertyAccessorFactory.forDirectFieldAccess(userFound.get());
            changes.forEach((attr, value) -> propertyAccessor.setPropertyValue(attr, value));
            repo.save(userFound.get());
            return userFound;
        }
        return Optional.empty();
    }

    public void delete(Users user) {
        repo.delete(user);
    }
}
