package org.example.sjoerd.dag10Overerving.app.domain;

public class VasteWerknemer extends Werknemer implements Comparable{

    private int salarisSchaal;

    public VasteWerknemer(int id, String naam, int salarisSchaal) {
        super(id,naam);
        setSalarisschaal(salarisSchaal);
    }

    private void setSalarisschaal(int salarisSchaal) {
        this.salarisSchaal = salarisSchaal;
    }

    public int getSalarisSchaal() {
        return salarisSchaal;
    }

    public int getSalaris() {
        return salarisSchaal * 1000;
    }


    public String toString () {
        return "Vaste"  + super.toString () + " en salarisschaal = " + salarisSchaal + "]";
    }

    public int compareTo(Object otherObject) {
        Werkneembaar otherwerkneembaar = (Werkneembaar) otherObject;
        return this.getSalaris () - otherwerkneembaar.getSalaris ();
    }

    //public int compareTo(Object otherObject) {
    //    Werkneembaar otherwerkneembaar = (Werkneembaar) otherObject;
    //    return this.getId () - otherwerkneembaar.getId ();
    //}
}
