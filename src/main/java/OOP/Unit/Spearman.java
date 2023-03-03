package OOP.Unit;
public class Spearman extends Warrior {

    public Spearman(String name, Vector2D coords) {
        super(name, 70.f, 70, 10, 2, 4, 9,
                6, coords.posX, coords.posY);
    }
    @Override
    public String getProfession() {
        return "Копейщик";
    }
    @Override
    public String getEmoji() {
        if(hp == 0) return "\uD83D\uDC80";
        return "\uD83D\uDC77\u200D♂️";
    }
}
