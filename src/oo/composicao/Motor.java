package oo.composicao;

public class Motor {

    final Car car;
    boolean awake = false;
    double injectionFactor = 1;

    private final static int revolutionsPerMinute = 3000;
    Motor(Car car) {
        this.car = car;
    }

    int getRevolutionsPerMinute() {
        if(!awake) {
            return 0;
        } else {
            return (int) Math.round(injectionFactor * revolutionsPerMinute);
        }
    }
}
