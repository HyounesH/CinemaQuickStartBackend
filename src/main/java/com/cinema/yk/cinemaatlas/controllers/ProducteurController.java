package com.cinema.yk.cinemaatlas.controllers;

import com.cinema.yk.cinemaatlas.entities.Producteur;
import com.cinema.yk.cinemaatlas.services.ProducteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/movie/producteur")
public class ProducteurController {
    @Autowired
    private ProducteurService producteurService;
    @PostMapping("/add")
    public ResponseEntity<Producteur> add(@RequestBody Producteur producteur) {
        return ResponseEntity.ok(producteurService.add(producteur));
    }
   @GetMapping("/all")
    public ResponseEntity<List<Producteur>> all() {

        return ResponseEntity.ok(producteurService.all());
    }
    @RequestMapping(value = "/delete/{cne}",method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable  String cne) {
        try {
            producteurService.delete(cne);
            return ResponseEntity.noContent().build();
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }
}
