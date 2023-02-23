package OOP.Unit;

import OOP.Unit.Human;

public abstract class Warrior extends Human {

    public Warrior(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }

    //    Атака ближнего боя
    @Override
    public int getAttack() {
        return attack;
    }
}
