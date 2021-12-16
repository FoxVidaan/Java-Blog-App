package fr.formation.blogAPI.services;

import fr.formation.blogAPI.entities.Article;
import fr.formation.blogAPI.repositories.ArticleRepository;

import java.util.List;

public class ArticleService {

    private ArticleRepository repository;

    public ArticleService(ArticleRepository repository) {
        this.repository = repository;
    }

    public List<Article> findAll() {
        return this.repository.findAll();
    }

    public Article findBySlug(String slug) {
        return this.repository.findBySlug(slug);
    }

    public Article save(Article article) {
        return this.repository.save(article);
    }

    public void delete(Article article) {
        this.repository.delete(article);
    }
}
