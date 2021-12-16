package fr.formation.blogAPI.controllers;

import fr.formation.blogAPI.entities.User;
import fr.formation.blogAPI.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    private UserService service;

    public UsersController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{username}")
    public User findByUsername(@PathVariable String username) {
        return this.service.findByUsername(username);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return this.service.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return this.service.save(user);
    }

    @DeleteMapping
    public void delete(@RequestBody User user) {
        this.service.delete(user);
    }
}