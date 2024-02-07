package oo.heranca.teste;

import oo.heranca.desafio.Car;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarTest {
    public static void main(String[] args) {

        Car c1 = new Civic();

        c1.accelerate();
        System.out.println(c1);

        c1.accelerate();
        System.out.println(c1);

        c1.accelerate();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);
        c2.turnTurboOn();
        c2.turnAiroff();
        c2.turnTurboOff();

        System.out.println(c2.airSpeed());

        c2.accelerate();
        c2.brake();
        System.out.println(c2);

        c2.accelerate();
        c2.brake();
        System.out.println(c2);

        c2.accelerate();
        System.out.println(c2);
    }
}
