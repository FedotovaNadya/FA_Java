package com.blog.blog.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.blog.models.Article;
import com.blog.blog.repo.ArticleRepository;


@Controller
public class BlogController {

	@Autowired
	private ArticleRepository articleRepository;

	@GetMapping("/blog")
    public String blogMain( Model model) {
		Iterable <Article> articles = articleRepository.findAll();
		model.addAttribute("articles", articles); //передаем статьи на страничку
		return "blog-main";
	}

	@GetMapping("/blog/add")
    public String blogAdd( Model model) {
		return "blog-add";
	}

	@PostMapping("/blog/add")
    public String blogArtitcleAdd(@RequestParam String title,@RequestParam String anons,@RequestParam String full_text,    Model model) {
		Article article = new Article(title, anons, full_text);
		articleRepository.save(article);

		return "redirect:/blog";
	}
	@GetMapping("/blog/{id}")
    public String blogDetails(@PathVariable(value="id") Long id, Model model) {
		if (!articleRepository.existsById(id)){
			return "redirect:/blog";
		}
		Optional<Article> article = articleRepository.findById(id);
		ArrayList<Article> res = new ArrayList<>();
		article.ifPresent(res::add);
		 model.addAttribute("article", res);
		return "blog-details";
	}

	@GetMapping("/blog/{id}/edit")
    public String blogEdit(@PathVariable(value="id") Long id, Model model) {
		if (!articleRepository.existsById(id)){
			return "redirect:/blog";
		}
		Optional<Article> article = articleRepository.findById(id);
		ArrayList<Article> res = new ArrayList<>();
		article.ifPresent(res::add);
		 model.addAttribute("article", res);
		return "blog-edit";
	}

	@PostMapping("/blog/{id}/edit")
    public String blogArtitcleUpdate(@PathVariable(value="id") Long id,@RequestParam String title,@RequestParam String anons,@RequestParam String full_text,    Model model) {
		Article article = articleRepository.findById(id).orElseThrow();
		article.setTitle(title);
		article.setAnons(anons);
		article.setFull_text(full_text);
		articleRepository.save(article);

		return "redirect:/blog";
	}

	@PostMapping("/blog/{id}/remove")
    public String blogArtitcleRemove(@PathVariable(value="id") Long id, Model model) {
		Article article = articleRepository.findById(id).orElseThrow();
		articleRepository.delete(article);
		return "redirect:/blog";
	}


}