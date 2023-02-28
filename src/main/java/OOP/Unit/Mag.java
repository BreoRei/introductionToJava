package OOP.Unit;

import java.util.ArrayList;

public abstract class Mag extends Human {
    protected int mana;
    protected int maxMana;
    public Mag(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die")) return;
        if (mana > 4){
            for (Human human : team1) {
                if (human.hp < human.maxHp) {
                    healing(human);
                    mana -= 5;
                    return;
                }
            }
        } else {
            int index = findNearest(team2);
            if (team2.get(index).hp - 1 <= 0) {
                team2.get(index).state = "Die";
                team2.get(index).hp = 0;
            } else {
                team2.get(index).hp -= 1;
            }
        }
    }
    @Override
    public String toString() {
        return name +
                "\t| H:" + Math.round(hp) +
                "\tD:" + defense +
                " \tA:" + attack +
                " \tDmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) + "\t" +
                state +
                " \tShots:" + mana;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder(getProfession());
        return builder.append(":  \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t| MP:\t").append(mana)
                .append("\t|")
//                .append("  (X:Y): ")
//                .append(coords.posX).append(":").append(coords.posY)
                .append("\t|");
    }
    protected void healing(Human human) {
        float newHp = human.getHp()-damageMax;
        if (newHp > human.getMaxHp()) {
            human.setHp(human.getMaxHp());
        } else {
            human.setHp(newHp);
        }
    }
}
