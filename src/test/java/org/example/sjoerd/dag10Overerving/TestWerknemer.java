package org.example.sjoerd.dag10Overerving;

import org.example.sjoerd.dag10Overerving.app.domain.TijdelijkeWerknemer;
import org.example.sjoerd.dag10Overerving.app.domain.VasteWerknemer;
import org.example.sjoerd.dag10Overerving.app.domain.Werknemer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
}
