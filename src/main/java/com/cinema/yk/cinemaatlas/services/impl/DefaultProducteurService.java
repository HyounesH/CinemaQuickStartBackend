package com.cinema.yk.cinemaatlas.services.impl;

import com.cinema.yk.cinemaatlas.entities.Producteur;
import com.cinema.yk.cinemaatlas.repository.ProducteurRepository;
import com.cinema.yk.cinemaatlas.services.ProducteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultProducteurService implements ProducteurService {
    @Autowired
    private ProducteurRepository producteurRepository;
    @Override
    public Producteur add(Producteur producteur) {
        return producteurRepository.save(producteur);
    }

    @Override
    public List<Producteur> all() {
        return producteurRepository.findAll();
    }

    @Override
    public void delete(String cne) {
    producteurRepository.deleteById(cne);
    }
}
