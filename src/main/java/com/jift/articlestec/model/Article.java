package com.jift.articlestec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="articles")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long articleId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="category")
	private String category;
	
	@Column(name="author")
	private String author;
	
	@Column(name="description")
	private String description;
	
	@Column(name="content")
	private String content;

	public long getArticleId() {
		return articleId;
	}

	
	public Article() {}
	
	public Article(long articleId, String title, String category, String author, String description, String content) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.category = category;
		this.author = author;
		this.description = description;
		this.content = content;
	}


	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
