package com.example.movie.repository;

import java.util.ArrayList;

import com.example.movie.model.Movie;

public interface MovieRepository {
	
	ArrayList <Movie> getMovieList();
    
	Movie addMovie(Movie movie);

	Movie getMovieById(int movieId);

	Movie updateMovie(int movieId, Movie movie);
    
    void deleteMovie(int movieId);

}
