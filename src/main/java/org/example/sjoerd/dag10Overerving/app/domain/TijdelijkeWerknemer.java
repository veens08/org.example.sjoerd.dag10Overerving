package org.example.sjoerd.dag10Overerving.app.domain;

public class TijdelijkeWerknemer extends Werknemer{

    private int aantalUren;
    private int uurTarief;

    public TijdelijkeWerknemer(int id, String naam, int aantalUren, int uurTarief) {
        super(id, naam);
        setAantalUren (aantalUren);
        setUurTarief (uurTarief);
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

    public int getSalaris () {
        return aantalUren * uurTarief;
    }
}
