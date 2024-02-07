package oo.polimorfismo;

import oo.polimorfismo.Person;

public class Dinner {
    public static void main(String[] args) {
        Person person = new Person(99.65);
        Rice rice = new Rice(.2);
        Beans beans = new Beans(0.1);
        Food food = new Rice(0.3);

        System.out.println(person.getWeight());

        person.eat(rice);
        person.eat(beans);
        person.eat(food);

        System.out.println(person.getWeight());

        IceCream iceCream = new IceCream(0.4);

        person.eat(iceCream);
        System.out.println(person.getWeight());
    }
}
