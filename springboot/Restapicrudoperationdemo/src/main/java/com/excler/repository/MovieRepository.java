package com.excler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excler.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
