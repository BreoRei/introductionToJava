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
                .append("\t|");
    }
    @Override
    public String getProfession() {
        return "Фермер";
    }
    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2, ArrayList<Barrier> barriers) {
        if (state.equals("Die")) return;
        if (state.equals("Empty")) state = "Stand";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDDD1\u200D\uD83C\uDF3E";
    }
}
