package oo.heranca.desafio;

public class Car {

    public final int topSpeed;
    protected int actualSpeed;
    private int delta = 5;

    protected Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if(actualSpeed + getDelta() > topSpeed) {
            actualSpeed = topSpeed;
        } else {
            actualSpeed += getDelta();
        }
    }

    public void brake() {
        if(actualSpeed >= 5) {
            actualSpeed -= 5;
        } else {
            actualSpeed = 0;
        }
    }

    public String toString() {
        return "Velocidade atual é " + actualSpeed + "Km/h.";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
