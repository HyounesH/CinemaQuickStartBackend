package com.cinema.yk.cinemaatlas.repository;

import com.cinema.yk.cinemaatlas.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
