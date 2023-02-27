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
}
