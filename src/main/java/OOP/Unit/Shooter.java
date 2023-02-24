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

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (hp > 0) {
            if (cartridges > 0) {
                int index = super.findNearest(team2);
                makeDamage(team2.get(index));
                if (findFarmer(team1)) {
                    return;
                }
                cartridges--;
            }
        }
    }
    protected boolean findFarmer(ArrayList<Human> team) {
        ArrayList<Human> arrayFarmer = new ArrayList<>();
        for (Human human : team) {
            if (human.getInfo().toString().split(":")[0].equals("Фермер")
                    && ((Farmer) human).getCartridgesFarmer() > 0) {
                arrayFarmer.add(human);
            }
        }
        switch (arrayFarmer.size()) {
            case (0) -> {
                return false;
            }
            case (1) -> {
                ((Farmer) arrayFarmer.get(0)).setCartridgesFarmer(0);
                return true;
            }
            default -> {
                ((Farmer) arrayFarmer.get(findNearest(arrayFarmer))).setCartridgesFarmer(0);
                return true;
            }
        }
    }
}
