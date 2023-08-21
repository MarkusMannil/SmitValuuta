package com.valuuta.SmitValuuta.valuuta;

import jakarta.persistence.*;

@Entity
@Table(name = "valuuta")

public class Valuuta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nimi;
    private double vaartus;
    private String sümbol;

    public Valuuta(Long id, String nimi, double vaartus, String sümbol) {
        this.id = id;
        this.nimi = nimi;
        this.vaartus = vaartus;
        this.sümbol = sümbol;
    }

    public Valuuta(String nimi, double vaartus, String sümbol) {
        this.nimi = nimi;
        this.vaartus = vaartus;
        this.sümbol = sümbol;
    }

    public Valuuta() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getVaartus() {
        return vaartus;
    }

    public void setVaartus(double vaartus) {
        this.vaartus = vaartus;
    }

    public String getSümbol() {
        return sümbol;
    }

    public void setSümbol(String sümbol) {
        this.sümbol = sümbol;
    }

    @Override
    public String toString() {
        return "Valuuta{" +
                "id=" + id +
                ", nimi='" + nimi + '\'' +
                ", vaartus=" + vaartus +
                '}';
    }
}
