package OOP.Unit;

public class Crossbowman extends Shooter {

    public Crossbowman(String name, Vector2D coords) {
        super(name, 60.f, 60, 8, 3, 7, 4,
                9, 20, 10, coords.posX, coords.posY);
    }
    @Override
    public String getProfession() {
        return "Арбалет";
    }
}
