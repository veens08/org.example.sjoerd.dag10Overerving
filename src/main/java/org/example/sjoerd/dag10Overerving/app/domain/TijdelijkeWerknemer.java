package org.example.sjoerd.dag10Overerving.app.domain;

public class TijdelijkeWerknemer {

    private int id;
    private String naam;
    private int aantalUren;
    private int uurTarief;

    public TijdelijkeWerknemer(int id, String naam, int aantalUren, int uurTarief) {

        this.id = id;
        this.naam = naam;
        this.aantalUren = aantalUren;
        this.uurTarief = uurTarief;
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

    public int getAantalUren() {
        return aantalUren;
    }

    public void setAantalUren(int aantalUren) {
        this.aantalUren = aantalUren;
    }

    public int getUurTarief() {
        return uurTarief;
    }

    public void setUurTarief(int uurTarief) {
        this.uurTarief = uurTarief;
    }
}
