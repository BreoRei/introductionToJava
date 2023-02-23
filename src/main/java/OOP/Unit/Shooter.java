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
        if (hp > 0) {
            int arrows = getCartridges();
            if (arrows > 0) {
                int index = super.findNearest(team2);
                makeDamage(team2.get(index));
            }
            if (findFarmer(team1)) {
                setCartridges(getCartridges()+1);
            }
        }
    }
    protected boolean findFarmer(ArrayList<Human> team) {
        ArrayList <Human> arrayFarmer = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getClass() == Farmer.class) {
                if(((Farmer) team.get(i)).getCartridgesFarmer() > 0) {
                    arrayFarmer.add(team.get(i));
                }
            }
        }
        switch (arrayFarmer.size()) {
            case (0):
                return false;
            case (1):
                ((Farmer) arrayFarmer.get(0)).setCartridgesFarmer(0);
                return true;
            default:
                ((Farmer) arrayFarmer.get(findNearest(arrayFarmer))).setCartridgesFarmer(0);
                return true;
        }
    }
    @Override
    public void makeDamage (Human unit) {
        int damage = unit.getDefense() - attack;
        float hp;
        if(damage < 0) {
            hp = unit.getHp() - damageMax;
            unit.setHp(hp < 0 ? 0: hp);
        } else if (damage > 0) {
            hp = unit.getHp() - damageMin;
            unit.setHp(hp < 0 ? 0: hp);
        } else {
            hp = unit.getHp() - ((damageMax+damageMin)/2);
            unit.setHp(hp < 0 ? 0: hp);
        }
        setCartridges(getCartridges()-1);
    }
    protected int getCartridges() {
        return this.cartridges;
    }
    protected void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }
}
