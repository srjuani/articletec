package com.jift.articlestec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jift.articlestec.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

	
	
}
