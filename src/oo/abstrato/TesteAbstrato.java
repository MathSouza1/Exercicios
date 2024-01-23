package oo.abstrato;

public class TesteAbstrato {

    public static void main(String[] args) {
        Mammal dog = new Dog();
        System.out.println(dog.move());
        System.out.println(dog.breastfeed());
        System.out.println(dog.breathe());
    }
}
