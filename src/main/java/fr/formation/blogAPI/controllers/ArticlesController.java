package fr.formation.blogAPI.controllers;

import fr.formation.blogAPI.entities.Article;
import fr.formation.blogAPI.services.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesController {
    private ArticleService service;

    public ArticlesController(ArticleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Article> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{slug}")
        public Article find(@PathVariable String slug) {
        return this.service.findBySlug(slug);
    }

    @PostMapping
    public Article create(@RequestBody Article article) {
        return this.service.save(article);
    }

    @PutMapping
    public Article update(@RequestBody Article article) {
        return article;
    }

    @DeleteMapping
    public void delete(@RequestBody String slug) {
    }
}
