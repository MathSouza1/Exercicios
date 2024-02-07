package oo.heranca.desafio;

public class Ferrari extends Car implements Sport, Luxury {

    private boolean turnTurbo = false;
    private boolean turnAir = false;

    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void turnTurboOn() {
        turnTurbo = true;
    }

    @Override
    public void turnTurboOff() {
        turnTurbo = false;
    }
    @Override
    public void turnAirOn() {
        turnAir = true;
    }

    @Override
    public void turnAiroff() {
        turnAir = false;
    }

    @Override
    public int airSpeed() {
        return Luxury.super.airSpeed();
    }
    
    @Override
    public int getDelta() {
        if(turnTurbo && !turnAir) {
            return 35;
        } else if(turnTurbo && turnAir) {
            return 30;
        } else if(!turnTurbo && !turnAir) {
            return 20;
        } else {
            return 15;
        }
    }


//	@Override
//	public void acelerar() {
//		super.acelerar();
//	}
}
