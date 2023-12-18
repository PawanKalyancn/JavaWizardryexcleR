package com.excler.services;

import java.util.List;


import com.excler.entity.Movie;

public interface MovieServies {

	Movie addmovie(Movie mov);
		List<Movie> getALLMovies();
		Movie getMovieById(int no);
		String deleteMovie(int no);
		 String updateMovie(int no,Movie movie);
}

 