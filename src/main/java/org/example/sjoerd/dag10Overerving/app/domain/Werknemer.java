package org.example.sjoerd.dag10Overerving.app.domain;

public class Werknemer {
    private int id;
    private String naam;

    public Werknemer(int id, String naam) {
        setId (id);
        setNaam (naam);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getSalaris() {
        return 0;
    }
}
