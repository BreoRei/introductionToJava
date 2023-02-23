package OOP.Unit;

import java.util.ArrayList;

public class Crossbowman extends Shooter {

    protected Crossbowman(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
                       int speed, int cartridges, int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, cartridges, range, posX, posY);
    }

    public Crossbowman(String name, Vector2D coords) {
        super(name, 60.f, 60, 7, 3, 7, 4,
                9, 20, 10, coords.posX, coords.posY);
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        float hp = getHp();
        if (hp > 0) {
            int arrows = getCartridges();
            if (arrows > 0) {
                int index = super.findNearest(team1);
                makeDamage(team1.get(index));
            }
            if (findFarmer(team2)) {
                setCartridges(getCartridges()+1);
            }
        }
    }

    @Override
    public int getAttack() { return attack; }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t| ATK:\t").append(Crossbowman.super.attack)
                .append("\t| HP:\t").append(Crossbowman.super.hp)
                .append(" \t| Arrows:").append(Crossbowman.super.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.coords.posX).append(".").append(Crossbowman.super.coords.posY);
    }
}
