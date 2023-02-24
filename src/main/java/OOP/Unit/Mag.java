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
        ArrayList <Human> findLive = super.findLive(team1);
        if (hp > 0) {
            mana = ((mana += 2) > maxMana) ? maxMana : mana + 2;
            if (mana > 9){
                for (Human human : findLive) {
                    if (human.getHp() < human.getMaxHp()) {
                        healing(human);
                        mana -= 10;
                        return;
                    }
                }
            }
        }
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
