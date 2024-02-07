package oo.abstrato;

public class Dog extends Mammal {

    @Override
    public String move() {
        return "Using paws";
    }

    @Override
    public String breastfeed() {
        return "Drinking milk";
    }
}
