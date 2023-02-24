package OOP.Unit;

import OOP.Unit.Human;

import java.util.ArrayList;

public abstract class Warrior extends Human {

    public Warrior(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (hp > 0) {
            int index = super.findNearest(team2);
            makeDamage(team2.get(index));
        }
    }
}
