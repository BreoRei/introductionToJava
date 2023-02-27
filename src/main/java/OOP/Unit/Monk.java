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
}
