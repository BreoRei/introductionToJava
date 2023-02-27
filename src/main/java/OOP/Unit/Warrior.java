package OOP.Unit;

import java.util.ArrayList;

public abstract class Warrior extends Human {

    public Warrior(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                   int defense, int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die")) return;
        int index = findNearest(team2);
        makeDamage(team2.get(index));
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(getProfession());
        return builder.append(": \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t|\t\t\t|")
                .append("  (X:Y): ")
                .append(coords.posX).append(":").append(coords.posY)
                .append("\t|");
    }
}
