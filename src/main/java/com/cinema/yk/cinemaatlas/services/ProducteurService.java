package com.cinema.yk.cinemaatlas.services;

import com.cinema.yk.cinemaatlas.entities.Producteur;

import java.util.List;

public interface ProducteurService {
    Producteur add(Producteur producteur);
    List<Producteur> all();
    void delete(String cne);
}
