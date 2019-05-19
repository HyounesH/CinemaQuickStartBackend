package com.cinema.yk.cinemaatlas.controllers;

import com.cinema.yk.cinemaatlas.entities.Movie;
import com.cinema.yk.cinemaatlas.services.MovieService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;
    @PostMapping("/add")
    public ResponseEntity<Movie> add(@RequestBody Movie movie) {

        return ResponseEntity.ok(movieService.add(movie));
    }
   @PutMapping("/update")
    public ResponseEntity<Movie> update(@RequestBody  Movie movie) {
        return ResponseEntity.ok(movieService.update(movie));
    }
   @GetMapping("/all")
    public ResponseEntity<List<Movie>> all() {
        return ResponseEntity.ok(movieService.all());
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
       try{
           movieService.delete(id);
           return ResponseEntity.noContent().build();
       }catch (Exception ex){
      return ResponseEntity.badRequest().build();
       }
    }


}
