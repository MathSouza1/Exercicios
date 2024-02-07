package oo.composicao;

public class Car {

    final Motor motor;

    Car() {
        this.motor = new Motor(this);
    }

    void accelerate() {
        if(motor.injectionFactor < 2.6) {
            motor.injectionFactor += 0.4;
        }
    }

    void brake() {
        if(motor.injectionFactor > 0.5) {
            motor.injectionFactor -= 0.4;
        }
    }

    void turnOn() {
        motor.awake = true;
    }

    void turnOff() {
        motor.awake = false;
    }

    boolean isOn() {
        return motor.awake;
    }
}
