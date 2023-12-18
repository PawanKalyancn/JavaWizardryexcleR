package com.excler.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excler.entity.Movie;
import com.excler.exception.IdNotfoundException;
import com.excler.repository.MovieRepository;
@Service
public class MovieServiesImpl implements MovieServies {
	
	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public Movie addmovie(Movie mov) {		
		Movie movie1 = movieRepository.save(mov);
		return movie1;
		}

	@Override
	public List<Movie> getALLMovies() {
		return movieRepository.findAll();		
	}

	@Override
	public Movie getMovieById(int no) {
		Optional<Movie> op =movieRepository.findById(no);
		Movie movie =null;
		if(op.isPresent()) {
			movie =op.get();
		}
		else
		  {
			  throw new IdNotfoundException();
		  }
		return movie;
	}

	@Override
	public String deleteMovie(int no) {
		String msg=" ";
		if(movieRepository.existsById(no))
		{
			movieRepository.deleteById(no);
			msg="movie delted";
		}
		else {
			msg="movie not found";
		}
		return msg;
	}

	@Override
	public String updateMovie(int no,Movie movie) {
		String msg="";
		if(movieRepository.existsById(no))
		{
			Movie movie2 = movieRepository.findById(no).get();
			movie2.setMovie_name(movie.getMovie_name());
			movie2.setGenre(movie.getGenre());
			movie2.setMovie_year(movie.getMovie_year());
			movie2.setCountry(movie.getCountry());
			movieRepository.save(movie2);
			msg ="movie successfully upadtaed";
		}
		else {
			msg="movie no  not found";
		}
		return msg;
	}

	

}
