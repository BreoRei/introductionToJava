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
        Human enemy = team2.get(index);
        if (coords.getDistance(enemy.coords) < 2) {
            makeDamage(team2.get(index));
            return;
        }
        if (coords.getDown(enemy.coords)) {
            if (coords.posY - 1 > enemy.coords.posY && coords.getEmpty(team1, coords.posX, coords.posY - 1)) {
                stepDown();
            } else {
                sidestep(team1, enemy);
            }
        }else {
            if (coords.posY + 1 < enemy.coords.posY && coords.getEmpty(team1, coords.posX, coords.posY + 1)) {
                stepUp();
           } else {
                sidestep(team1, enemy);
           }
       }
    }
    protected void stepDown() {
        coords.posY -= 1;
    }

    protected void stepUp() {
        coords.posY += 1;
    }

    protected void sidestep(ArrayList<Human> team, Human enemy) {
        if (coords.getLeft(enemy.coords)) {
            if (coords.getEmpty(team, coords.posX - 1, coords.posY)){
                coords.posX -= 1;
            }
        } else {
            if (coords.getEmpty(team, coords.posX + 1, coords.posY)) {
                coords.posX += 1;
            }
        }
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(getProfession());
        return builder.append(": \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t|\t\t\t|")
//                .append("  (X:Y): ")
//                .append(coords.posX).append(":").append(coords.posY)
                .append("\t|");
    }
}
