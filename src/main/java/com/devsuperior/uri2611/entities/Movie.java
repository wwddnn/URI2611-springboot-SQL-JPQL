package com.devsuperior.uri2611.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

	//attributes
	@Id
	private Long id;
	private String name;

	//dependency
	@ManyToOne
	@JoinColumn(name = "id_genres")
	private Genre genre;

	//constructor
	public Movie() {
	}

	//constructor with parameters
	public Long getId() {
		return id;
	}

	//get and set method
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
}
