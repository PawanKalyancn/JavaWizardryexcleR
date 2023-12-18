package com.excler.contoller;
	import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.excler.entity.Movie;
import com.excler.services.MovieServies;
	
@CrossOrigin
	@RestController
	@RequestMapping("/api/v1")
	public class Moviecontoller {
	     
		@Autowired
		MovieServies movieservies;
		
		@PostMapping("/Movies")
		public ResponseEntity<Movie> addmovie( @RequestBody Movie movie){
			Movie movie2 = movieservies.addmovie(movie);
			return new ResponseEntity<Movie>(movie2,HttpStatus.OK);
		}
	   
		@GetMapping("/Movies")
		public ResponseEntity<List<Movie>>getALLMovies()
		{
			return new ResponseEntity<List<Movie>>(movieservies.getALLMovies(), HttpStatus.OK);
		}
		@GetMapping("/Movies/{no}")
		public ResponseEntity<Movie>getMovieById(@PathVariable int no)
		{
			return new ResponseEntity<Movie>(movieservies.getMovieById(no), HttpStatus.OK);
		}
		
		@DeleteMapping("/Movies/{no}")
		public ResponseEntity<String> deleteMovie(@PathVariable int no)
		{
			return new ResponseEntity<String>(movieservies.deleteMovie(no), HttpStatus.OK);
		} 
		
		@PutMapping("/Movies/{no}")
		public ResponseEntity<String> updateMovie(@PathVariable int no ,@RequestBody Movie movie){
			return new ResponseEntity<String>(movieservies.updateMovie(no,movie), HttpStatus.OK);
		}
		

			
		//@ExceptionHandler(NoSuchElementException.class)
		//public String  myExceptionResponse()
		//{
		//	return "no id found to get";
	//	}
		
	}

	
	/*
	 * another method works same
	 *  @GetMapping
	    public List<Movie> getAllMovies() {
	        return movieServies.getALLMovies();
	    }

	    @GetMapping("/{no}")
	    public Movie getMovieById(@PathVariable int no) {
	        return movieServies.getMovieById(no);
	    }

	    @PostMapping
	    
	    public Movie addmovie(@RequestBody Movie movie) {
	        return movieServies.addmovie(movie);
	    }

	    @PutMapping("/{no}")
	    public String updateMovie(@PathVariable int no, @RequestBody Movie updatedMovie) {
	        return MovieServies.updateMovie(no, updatedMovie);
	    }

	    @DeleteMapping("/{no}")
	    public void deleteMovie(@PathVariable int no) {
	        movieServies.deleteMovie(no);
	    }
	 * 
	 * 
	 * 
	 * 
	 */
