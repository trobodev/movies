package com.roberto.movies.repositories;

import com.roberto.movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

} // interface
