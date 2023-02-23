package OOP.Unit;

import java.util.ArrayList;

public abstract class Shooter extends Human {
    protected int range;
    protected int cartridges;

    protected Shooter(String name, float hp, int maxHp, int attack, int damageMin,
                   int damageMax, int defense, int speed, int cartridges,
                   int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.cartridges = cartridges;
    }

//    Реализовать метод step() лучников.
//    3.1 Если жизнь равна нулю или стрел нет, завершить обработку.
//    3.2 Поиск среди противников наиболее приближённого.
//    3.3 Нанести среднее повреждение найденному противнику.
//    3.4 Найти среди своих крестьянина.
//    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        float hp = getHp();
        if (hp != 0) {
            int arrows = getCartridges();
            if (arrows > 0) {
                int index = super.findNearest(team2);
                makeDamage(team2.get(index));
            } else {
                findFarmer(team1);
            }
        }
    }
    protected Human findFarmer(ArrayList<Human> team) {
        ArrayList <Human> arrayFarmer = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getClass() == Farmer.class) {
                if((((Farmer) team.get(i)).getCartridgesFarmer()) > 0) {
                    arrayFarmer.add(team.get(i));
                }
            }
        }
        return arrayFarmer.get(findNearest(arrayFarmer));
    }
    @Override
    public void makeDamage (Human unit) {
        float damage = unit.getDefense() - this.attack;
        if(damage < 0) {
            setHp(unit.getHp() - this.damageMax);
        } else if (damage > 0) {
            setHp(unit.getHp() - this.damageMin);
        } else {
            setHp(unit.getHp() - ((this.damageMax+this.damageMin)/2));
        }
        this.setCartridges(this.getCartridges()-1);
    }
    protected int getCartridges() {
        return this.cartridges;
    }

    protected void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }
}
