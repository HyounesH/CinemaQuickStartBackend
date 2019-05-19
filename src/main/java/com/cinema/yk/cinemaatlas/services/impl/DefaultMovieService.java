package com.cinema.yk.cinemaatlas.services.impl;

import com.cinema.yk.cinemaatlas.entities.Movie;
import com.cinema.yk.cinemaatlas.repository.MovieRepository;
import com.cinema.yk.cinemaatlas.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultMovieService implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Movie add(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie update(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> all() {
        return movieRepository.findAll();
    }

    @Override
    public void delete(Long id) {
      movieRepository.deleteById(id);
    }
}
