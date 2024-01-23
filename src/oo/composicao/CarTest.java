package oo.composicao;

public class CarTest {

    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.isOn());

        c1.turnOn();
        System.out.println(c1.isOn());

        System.out.println(c1.motor.getRevolutionsPerMinute());

        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();

        System.out.println(c1.motor.getRevolutionsPerMinute());

        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();


        // Faltou Encapsulamento!!!
        // c1.motor.fatorInjecao = -30;

        System.out.println(c1.motor.getRevolutionsPerMinute());

        // Relação bidirecional
        System.out.println(c1.motor.car.motor.car.motor.getRevolutionsPerMinute());
    }
}
