package fr.formation.blogAPI.repositories;

import fr.formation.blogAPI.entities.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository  extends MongoRepository<Article, String> {
    Article findBySlug(String slug);
}
