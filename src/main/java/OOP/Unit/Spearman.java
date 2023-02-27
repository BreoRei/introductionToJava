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
}
