package com.inmemory.controller;


import com.inmemory.model.User;
import com.inmemory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository repository;


    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }
    @GetMapping("id/{id}")
    public User getUserById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
}

    @PutMapping("{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        User user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return repository.save(user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable Long id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        repository.delete(user);
    }
}
