package OOP.Unit;


public class Witch extends Mag{

    public Witch(String name, Vector2D coords) {
        super(name, 50.f, 50, 5, -6, -6, 3,
                7, 60,60, coords.posX, coords.posY);
    }
    @Override
    public String getProfession() {
        return "Колдун";
    }
}