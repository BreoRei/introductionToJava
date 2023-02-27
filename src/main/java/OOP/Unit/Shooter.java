package OOP.Unit;

import java.util.ArrayList;

public abstract class Shooter extends Human {
    protected int range;
    protected int arrows;

    protected Shooter(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                      int defense, int speed, int arrows, int range, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.arrows = arrows;
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die") || arrows == 0) return;
        int index = findNearest(team2);
        makeDamage(team2.get(index));
        if (findFarmer(team1)) {
            return;
        }
        arrows--;
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder(getProfession());
        return builder.append(": \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t| Arrows:").append(arrows)
                .append("\t|")
                .append("  (X:Y): ")
                .append(coords.posX).append(":").append(coords.posY)
                .append("\t|");
    }
    protected boolean findFarmer(ArrayList<Human> team) {
        ArrayList<Human> arrayFarmer = new ArrayList<>();
        for (Human human : team) {
            if (human.getProfession().equals("Фермер") && human.state.equals("Stand")) {
                arrayFarmer.add(human);
            }
        }
        switch (arrayFarmer.size()) {
            case (0) -> {
                return false;
            }
            case (1) -> {
                arrayFarmer.get(0).state = "Empty";
                return true;
            }
            default -> {
                arrayFarmer.get(findNearest(arrayFarmer)).state = "Empty";
                return true;
            }
        }
    }
}
