package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    void accessTest() {
        // System.out.println(segredo);
        // System.out.println(facoDentroDeCasa);
        System.out.println(wayToSpeak);
        System.out.println(everyoneKnows);
        System.out.println(new Ana().everyoneKnows);
    }
}
