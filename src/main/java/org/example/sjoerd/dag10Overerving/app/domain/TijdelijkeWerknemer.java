package org.example.sjoerd.dag10Overerving.app.domain;

public class TijdelijkeWerknemer extends Werknemer implements Comparable {

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
        return "Tijdelijke" + super.toString () + "en uurloon = " + uurloon + "]";
    }

    public int compareTo(Object otherObject) {
        Werkneembaar otherwerkneembaar = (Werkneembaar) otherObject;
        return this.getSalaris () - otherwerkneembaar.getSalaris ();
    }

    //public int compareToId(Object otherObject) {
    //    Werkneembaar otherwerkneembaar = (Werkneembaar) otherObject;
    //    return this.getId () - otherwerkneembaar.getId ();
    //}
}
