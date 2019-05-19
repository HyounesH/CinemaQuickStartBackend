package com.cinema.yk.cinemaatlas.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Producteur implements Serializable {
    @Id
    private String cni;
    private String fname;
    private String lname;

    public Producteur(String cni, String fname, String lname) {
        this.cni = cni;
        this.fname = fname;
        this.lname = lname;
    }

    public Producteur() {
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
