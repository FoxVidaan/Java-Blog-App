package fr.formation.blogAPI.configurations;

import fr.formation.blogAPI.repositories.UserRepository;
import fr.formation.blogAPI.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    public UserService userService(UserRepository repository)
    {
        return new UserService(repository);
    }
}
