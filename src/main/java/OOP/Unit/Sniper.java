package OOP.Unit;

public class Sniper extends Shooter{

    public Sniper(String name, Vector2D coords) {
        super(name, 60.f, 60, 9, 3, 5, 3,
                9, 22, 10, coords.posX, coords.posY);
    }
    @Override
    public String getProfession() {
        return "Снайпер";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDDDD";
    }
}