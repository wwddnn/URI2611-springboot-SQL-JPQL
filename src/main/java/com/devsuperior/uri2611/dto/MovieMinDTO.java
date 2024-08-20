package com.devsuperior.uri2611.dto;

import com.devsuperior.uri2611.projections.MovieMinProjection;

public class MovieMinDTO {

    //attributes
    private Long id;
    private String name;

    //constructor
    public MovieMinDTO() {
    }

    //constructor with parameters
    public MovieMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //constructor with parameters projection
    public MovieMinDTO(MovieMinProjection projection) {
        id = projection.getId();
        name = projection.getName();
    }

    //get and set methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString


    @Override
    public String toString() {
        return "MovieMinDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
