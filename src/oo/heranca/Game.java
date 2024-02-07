package oo.heranca;

import oo.heranca.Direction;
import oo.heranca.Hero;
import oo.heranca.Monster;

public class Game {

    public static void main(String[] args) {

        Monster monster = new Monster();
        monster.x = 10;
        monster.y = 10;

        Hero hero = new Hero(10, 11);

        System.out.println("Monstro tem => " + monster.life);
        System.out.println("Heroi tem => " + hero.life);

        monster.atack(hero);
        hero.atack(monster);

        monster.atack(hero);
        hero.atack(monster);

        monster.walk(Direction.NORTH);
        monster.atack(hero);
        hero.atack(monster);

        System.out.println("Monstro tem => " + monster.life);
        System.out.println("Heroi tem => " + hero.life);
    }
}
