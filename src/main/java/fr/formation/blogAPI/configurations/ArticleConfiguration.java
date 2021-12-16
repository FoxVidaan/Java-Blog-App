package fr.formation.blogAPI.configurations;

import fr.formation.blogAPI.repositories.ArticleRepository;
import fr.formation.blogAPI.services.ArticleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArticleConfiguration {
    @Bean
    public ArticleService articleService(ArticleRepository repository)
    {
        return new ArticleService(repository);
    }
}
