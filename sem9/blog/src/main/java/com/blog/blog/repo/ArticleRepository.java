package com.blog.blog.repo;

import org.springframework.data.repository.CrudRepository;

import com.blog.blog.models.Article;

public interface ArticleRepository extends CrudRepository <Article, Long>{
    
}
