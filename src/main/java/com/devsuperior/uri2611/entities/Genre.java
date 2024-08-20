package com.devsuperior.uri2611.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genres")
public class Genre {

	//attributes
	@Id
	private Long id;
	private String description;

	//dependency
	@OneToMany(mappedBy = "genre")
	private List<Movie> movies = new ArrayList<>();

	//constructor
	public Genre() {
	}

	//get and set method
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Movie> getMovies() {
		return movies;
	}
}
