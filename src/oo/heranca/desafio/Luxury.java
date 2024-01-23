package oo.heranca.desafio;

public interface Luxury {
    public void turnAirOn();
    abstract void turnAiroff();
    default int airSpeed(){
        return 1;
    }
}
