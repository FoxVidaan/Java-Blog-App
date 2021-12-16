package fr.formation.blogAPI.repositories;

import fr.formation.blogAPI.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    /**
     * @param username
     * @return User
     */
    User findByUsername(String username);
}
