package org.example.sjoerd.dag10Overerving.app.domain;

import java.util.Comparator;

public class WerknemerSalarisComparator implements Comparator {

    public int compare(Object eersteObject, Object tweedeObject) {
        Werknemer w1 = (Werknemer) eersteObject;
        Werknemer w2 = (Werknemer) tweedeObject;

        int sorteerWaarde = w1.getSalaris () - w2.getSalaris ();
        if  (sorteerWaarde == 0) {
            sorteerWaarde = (w1.getNaam ().toLowerCase ().compareTo (w2.getNaam ().toLowerCase ()));
        }
        return sorteerWaarde;
    }
}
