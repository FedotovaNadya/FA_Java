package com.blog.blog.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author, full_text;
    @ManyToOne
    @JoinColumn (name = "idArticle", nullable = false)
    @JsonIgnore
    private Article article;

    public Comment( String author, String full_text, Article article) {
        this.author = author;
        this.full_text = full_text;
        this.article = article;
    }
    public Comment() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getFull_text() {
        return full_text;
    }
    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }


}
