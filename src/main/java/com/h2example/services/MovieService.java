package com.h2example.services;

import com.h2example.entities.Movie;
import com.h2example.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieService(){

    }

    public Movie createMovie(Movie movie) {
        return this.movieRepository.save(movie);
    }

    public List<Movie> getMovies() {
        return this.movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long movieId) {
        return this.movieRepository.findById(movieId);
    }
}
