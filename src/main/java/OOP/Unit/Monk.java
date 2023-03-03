package OOP.Unit;

public class Monk extends Mag{

    public Monk(String name, Vector2D coords) {
        super(name, 50.f, 50, 6, -7, -7, 3,
                7, 60 ,60, coords.posX, coords.posY);

    }
    @Override
    public String getProfession() {
        return "Монах";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83E\uDDD9\u200D♂️";
    }
}
