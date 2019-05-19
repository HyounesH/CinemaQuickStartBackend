package com.cinema.yk.cinemaatlas.services;

import com.cinema.yk.cinemaatlas.entities.Movie;

import java.util.List;

public interface MovieService {
    Movie add(Movie movie);
    Movie update(Movie movie);
    List<Movie> all();
    void delete(Long id);
}
