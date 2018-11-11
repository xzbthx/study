package com.springmvc.model;

public class Article {

	private int id;
	private String title;
	private String content;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
