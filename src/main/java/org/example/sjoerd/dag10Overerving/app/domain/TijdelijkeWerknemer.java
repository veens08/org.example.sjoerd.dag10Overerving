package org.example.sjoerd.dag10Overerving.app.domain;

import java.util.Comparator;

public class TijdelijkeWerknemer extends Werknemer {

    private int aantalUren;
    private int uurloon;

    public TijdelijkeWerknemer(int id, String naam, int aantalUren, int uurloon) {
        super(id, naam);
        setAantalUren (aantalUren);
        setUurloon (uurloon);
    }

    public int getAantalUren() {
        return aantalUren;
    }

    public void setAantalUren(int aantalUren) {
        this.aantalUren = aantalUren;
    }

    public int getUurloon () {
        return uurloon;
    }

    public void setUurloon(int uurloon) {
        this.uurloon = uurloon;
    }

    public int getSalaris () {
        return aantalUren * uurloon;
    }

    public String toString() {
        return "Tijdelijke" + super.toString () + " en uurloon = " + uurloon + "]";
    }

}
