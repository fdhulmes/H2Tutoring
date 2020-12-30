package com.h2example.controllers;

import com.h2example.entities.Movie;
import com.h2example.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/API")
public class MovieController {

    @Autowired
    private MovieService movieService;

    public MovieController(){

    }

    @PostMapping(value = "/movie")
    @ResponseBody
    public Movie createMovie(@RequestBody Movie movie){
        return this.movieService.createMovie(movie);
    }

    @GetMapping(value = "/movie")
    @ResponseBody
    public List<Movie> getMovies(){
        return this.movieService.getMovies();
    }

    @GetMapping(value = "/movie/{id}")
    @ResponseBody
    public Optional<Movie> getMovieById(@PathVariable("id") Long movieId){
        return this.movieService.getMovieById(movieId);
    }

}
