package com.jift.articlestec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jift.articlestec.model.Article;
import com.jift.articlestec.repository.ArticleRepository;

@Controller
@RequestMapping("/articles")
public class ArticleController {

	@Autowired
	private ArticleRepository articleRepository;
	
	@GetMapping//("/list")
	public String getAllArticle(Model model) {
		
		List<Article> articles = new ArrayList<>();
		articles = articleRepository.findAll();
		model.addAttribute("articles",articles);
		
		return "allArticles"; //VIEW
	}
	
}
