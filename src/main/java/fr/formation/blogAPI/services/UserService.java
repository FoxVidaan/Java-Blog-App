package fr.formation.blogAPI.services;

import fr.formation.blogAPI.entities.User;
import fr.formation.blogAPI.repositories.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return this.repository.findAll();
    }

    public User findByUsername(String username) {
        return this.repository.findByUsername(username);
    }

    public User save(User user) {
        return this.repository.save(user);
    }

    public void delete(User user) {
        this.repository.delete(user);
    }
}
