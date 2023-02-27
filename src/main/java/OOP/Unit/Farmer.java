package OOP.Unit;

import java.util.ArrayList;

public class Farmer extends Human {
    public Farmer(String name, Vector2D coords) {
        super(name, 50.f, 50, 1, 1, 1, 1,
                3, coords.posX, coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder(getProfession());
        return builder.append(": \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(hp)
                .append(" \t|\t\t\t|")
                .append("  (X:Y): ")
                .append(coords.posX).append(":").append(coords.posY)
                .append("\t|");
    }
    @Override
    public String getProfession() {
        return "Фермер";
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (state.equals("Die")) return;
        if (state.equals("Empty")) {
            state = "Stand";
        } else {
            state = "Stand";
            int index = findNearest(team2);
            if (team2.get(index).hp - 1 <= 0) {
                team2.get(index).state = "Die";
                team2.get(index).hp = 0;
            } else {
                team2.get(index).hp -= 1;
            }
        }
    }
}
