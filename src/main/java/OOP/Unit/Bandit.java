package OOP.Unit;

import java.util.ArrayList;

public class Bandit extends Warrior {

    public Bandit(String name, Vector2D coords) {
        super(name, 70.f, 70, 10, 2, 6, 7,
                6, coords.posX, coords.posY);
    }

    @Override
    public String getProfession() {
        return "Бандит";
    }

    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDD77";
    }
}
