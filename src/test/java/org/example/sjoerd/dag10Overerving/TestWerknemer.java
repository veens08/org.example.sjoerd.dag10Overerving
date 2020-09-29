package org.example.sjoerd.dag10Overerving;

import org.example.sjoerd.dag10Overerving.app.domain.TijdelijkeWerknemer;
import org.example.sjoerd.dag10Overerving.app.domain.VasteWerknemer;
import org.example.sjoerd.dag10Overerving.app.domain.Werkneembaar;
import org.example.sjoerd.dag10Overerving.app.domain.Werknemer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class TestWerknemer {

    @Test
    void maakMedewerkers () {
        VasteWerknemer v1 = new VasteWerknemer (1, "Sjoerd", 12);
        VasteWerknemer v2 = new VasteWerknemer (2, "Cas", 11);

        TijdelijkeWerknemer t1 = new TijdelijkeWerknemer (3, "Kees", 36, 50);
        TijdelijkeWerknemer t2 = new TijdelijkeWerknemer (4, "Jos", 36, 45);

        System.out.println (v1.getNaam () + " verdient " + v1.getSalaris ());
        System.out.println (t1.getNaam () + " verdient " + t1.getSalaris ());
    }

    @Test
    void maakWerknemersSalarisLijst2() {
        VasteWerknemer [] vasteWerknemers =maakAantalVasteWerknemersAan();
        printSalarisRapportVastemedewerkers (vasteWerknemers);

        TijdelijkeWerknemer[] tijdelijkeWerknemers = maakAantalTijdelijkeWerknemersAan ();
        printSalarisRapportTijdelijkeWerknemers (tijdelijkeWerknemers);

    }
    private VasteWerknemer [] maakAantalVasteWerknemersAan () {
        VasteWerknemer v1 = new VasteWerknemer (1, "Sjoerd", 12);
        VasteWerknemer v2 = new VasteWerknemer (2, "Cas", 11);
        VasteWerknemer [] vasteWerknemers = {v1, v2};
        return vasteWerknemers;
    }

    private TijdelijkeWerknemer[] maakAantalTijdelijkeWerknemersAan() {
        TijdelijkeWerknemer t1 = new TijdelijkeWerknemer (3, "Kees", 36, 50);
        TijdelijkeWerknemer t2 = new TijdelijkeWerknemer (4, "Jos", 36, 45);
        TijdelijkeWerknemer[] tijdelijkeWerknemers = {t1, t2};
        return tijdelijkeWerknemers;
    }

    private void printSalarisRapportVastemedewerkers(VasteWerknemer[] vasteWerknemers) {
        for (VasteWerknemer vm : vasteWerknemers) {
            System.out.println ("Id = " + vm.getId () + " naam = " + vm.getNaam () + " salaris = " + vm.getSalaris ());
        }
    }

    private void printSalarisRapportTijdelijkeWerknemers(TijdelijkeWerknemer[] tijdelijkeWerknemers) {
        for (TijdelijkeWerknemer tw : tijdelijkeWerknemers) {
            System.out.println ("Id = " + tw.getId () + " naam = " + tw.getNaam () + " salaris = " + tw.getSalaris ());
        }
    }

    @Test
    void maakEenSalarisRapportVoorAlleMedewerkersSlimmer () {
        Werknemer [] werknemers = maakAantalWerknemersAan();
        printSalarisRapportMedewerkers (werknemers);
    }

    private void printSalarisRapportMedewerkers(Werknemer [] werknemers) {
        for (Werknemer w : werknemers) {
            System.out.println ("Id = " + w.getId () + " naam = " + w.getNaam () + " salaris = " + w.getSalaris ());
        }
    }

    private Werknemer[] maakAantalWerknemersAan() {
        Werknemer v1 = new VasteWerknemer (1, "Sjoerd", 12);
        Werknemer v2 = new VasteWerknemer (2, "Cas", 11);
        Werknemer t1 = new TijdelijkeWerknemer (3, "Kees", 36, 50);
        Werknemer t2 = new TijdelijkeWerknemer (4, "Jos", 36, 45);
        Werknemer [] werknemers = {v1, v2, t1, t2};
        return werknemers;
    }

    @Test
    void allesIsEenObject() {
        String s = "een Stringetje";
        Object [] objects = { new Object(), new VasteWerknemer(1,"Jo",20), s};
        for(Object object : objects){
            System.out.println(object.toString());
        }
    }

    @Test
    void zijnDezeVWGelijk() {
        VasteWerknemer vw1 = new VasteWerknemer(1, "Jo", 10);
        VasteWerknemer vw2 = new VasteWerknemer(1, "Jo", 10);

        //Hier vergelijk je geen inhoud maar adressen
        if(vw1 == vw2){
            System.out.println("Gelijke adressen");
        }else{
            System.out.println("Ongelijk adressen");
        }

        if(vw1.equals(vw2)){
            System.out.println("Gelijke inhoud");
        }else{
            System.out.println("Ongelijke inhoud");
        }
    }

    @Test
    void deWerknemersSorterenOpSalaris () {

        Werkneembaar [] werkneemBaren = getWerkneemBaren ();

        printSalarisWerkneemBaren (werkneemBaren);

        Comparable comparable;

        Arrays.sort (werkneemBaren);

        System.out.println ("Werknemers gesorteerd op salaris:");
        printSalarisWerkneemBaren (werkneemBaren);

    }

    @Test
    void deWerknemersSorterenOpId () {

        Werkneembaar [] werkneemBaren = getWerkneemBaren ();

        Comparable comparable;

        Arrays.sort (werkneemBaren);

        System.out.println ("Werknemers gesorteerd op Id:");
        printSalarisWerkneemBaren (werkneemBaren);

    }
    private void printSalarisWerkneemBaren(Werkneembaar[] werkneemBaren) {
        for (Werkneembaar w : werkneemBaren) {
            System.out.println ("Id = " + w.getId () + " naam = " + w.getNaam () + " salaris = " + w.getSalaris ());
        }
    }

    private Werkneembaar[] getWerkneemBaren() {
        Werknemer v1 = new VasteWerknemer (4, "Sjoerd", 12);
        Werknemer v2 = new VasteWerknemer (1, "Rudy", 13);
        Werknemer v3 = new VasteWerknemer (3, "Tho", 12);
        Werknemer v4 = new VasteWerknemer (2, "Cas", 11);
        Werknemer t1 = new TijdelijkeWerknemer (7, "Theo", 144, 50);
        Werknemer t2 = new TijdelijkeWerknemer (5, "Rian", 144, 45);
        Werknemer t3 = new TijdelijkeWerknemer (6, "Ken", 144, 50);
        Werknemer t4 = new TijdelijkeWerknemer (8, "Jos", 144, 45);

        return new Werkneembaar [] {v1, v2, v3, v4, t1, t2, t3, t4};

    }
}
