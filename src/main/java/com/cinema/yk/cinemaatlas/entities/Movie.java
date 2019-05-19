package com.cinema.yk.cinemaatlas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private int rank;
    private Producteur producteur;
    private Date out_date;

    public Movie() {
    }

    public Movie(String title, String description, int rank, Date out_date) {
        this.title = title;
        this.description = description;
        this.rank = rank;
        this.out_date = out_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Producteur getProducteur() {
        return producteur;
    }

    public void setProducteur(Producteur producteur) {
        this.producteur = producteur;
    }

    public Date getOut_date() {
        return out_date;
    }

    public void setOut_date(Date out_date) {
        this.out_date = out_date;
    }
}
