package com.github.isaiasfmeli.playground.modulo3.controller;

import com.github.isaiasfmeli.playground.modulo3.dto.UserDto;
import com.github.isaiasfmeli.playground.modulo3.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // indica que esta classe é controller Rest
@RequestMapping("/")
public class IndexController {

    @GetMapping // requesição GET
    public String index() {
        return "IndexController - Pong!";
    }

    @GetMapping("/{name}")
    public String indexName(@PathVariable String name) {
        return "Your name: " + name;
    }

    @GetMapping("/{name}/{id}")
    public String indexNameId(@PathVariable String name, @PathVariable int id) {
        return "Your name: " + name + " and your id: " + id;
    }

    @PostMapping
    public ResponseEntity<UserDto> getUser(@RequestBody User user) {
        if (user.getId() == 123) {
            UserDto userDto = new UserDto(user);
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
    }

}
