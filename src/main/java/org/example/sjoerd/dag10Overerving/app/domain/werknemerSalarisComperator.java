package org.example.sjoerd.dag10Overerving.app.domain;

import java.util.Comparator;

public class werknemerSalarisComperator implements Comparator {

    public int compare(Object eersteObject, Object tweedeObject) {
        Werknemer w1 = (Werknemer) eersteObject;
        Werknemer w2 = (Werknemer) tweedeObject;
        return w1.getSalaris () - w2.getSalaris ();
    }
}
