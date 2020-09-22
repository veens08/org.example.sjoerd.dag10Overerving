package org.example.sjoerd.dag10Overerving;

import org.example.sjoerd.dag10Overerving.app.domain.TijdelijkeWerknemer;
import org.example.sjoerd.dag10Overerving.app.domain.VasteWerknemer;
import org.junit.jupiter.api.Test;

public class TestWerknemer {

    @Test
    void maakMedewerkers () {
        VasteWerknemer v1 = new VasteWerknemer (1,"Sjoerd",14);
        VasteWerknemer v2 = new VasteWerknemer (2,"Cas",12);

        TijdelijkeWerknemer t1 = new TijdelijkeWerknemer (3, "Kees", 36, 50);
        TijdelijkeWerknemer t2 = new TijdelijkeWerknemer (4, "Jos", 36, 45);
    }

}
