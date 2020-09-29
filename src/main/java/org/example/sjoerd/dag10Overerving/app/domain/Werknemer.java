package org.example.sjoerd.dag10Overerving.app.domain;

public abstract class Werknemer implements Werkneembaar {
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

    @Override
    public String toString() {
        return "werknemer [id = " + getId() + " naam = " + getNaam();
    }
    public abstract int getSalaris();

    public boolean equals(Object otherObject) {
        if(otherObject == null) {
            return false;
        } else if( !(otherObject instanceof Werknemer)){
            return false;
        }
        Werknemer otherwerknemer = (Werknemer) otherObject;
        return this.id == otherwerknemer.id;
    }

}
