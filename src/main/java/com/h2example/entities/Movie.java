package com.h2example.entities;

import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "RELEASE")
    private Integer year;

    @Column(name = "RATING")
    private Double rating;

    public Movie(){}

    public Movie(String title, String genre, Integer year, Double rating){
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
