package oo.heranca;

public class Hero extends Player {

    public Hero(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean atack(Player oponent) {
        boolean ataque1 = super.atack(oponent);
        boolean ataque2 = super.atack(oponent);
        boolean ataque3 = super.atack(oponent);
        return ataque1 || ataque2 || ataque3;
    }
}
