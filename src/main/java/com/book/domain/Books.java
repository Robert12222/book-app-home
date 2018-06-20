package com.book.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Books {

	private short id;
	private String bookTitle;
	private String genre;
	private int yearPublished; 
	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Authors> authors = new HashSet<Authors>();
	
	public Books() {
		
	}
	
	public Books(String bookTitle, String genre, int yearPublished) {
		this.bookTitle = bookTitle;
		this.genre = genre;
		this.yearPublished = yearPublished;
	}
	
	public String getBookTitle () {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getgenre() {
		return genre;
	}

	public void setgenre(String genre) {
		this.genre = genre;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

}

