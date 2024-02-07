package oo.heranca;

public class Player {

    public int life = 100;
    public int x;
    public int y;

    protected Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean atack(Player oponent) {
        int deltaX = Math.abs(x - oponent.x);
        int deltaY = Math.abs(y - oponent.y);

        if(deltaX == 0 && deltaY == 1) {
            oponent.life -= 10;
            return true;
        } else if(deltaX == 1 && deltaY == 0) {
            oponent.life -= 10;
            return true;
        } else {
            return false;
        }
    }

    public boolean walk(Direction direction) {
        switch(direction) {
            case NORTH:
                y--;
                break;
            case WEST:
                x++;
                break;
            case SOUTH:
                y++;
            case EAST:
                x--;
                break;
        }

        return true;
    }
}
