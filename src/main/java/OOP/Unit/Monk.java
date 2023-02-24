package OOP.Unit;

public class Monk extends Mag{

    public Monk(String name, Vector2D coords) {
        super(name, 50.f, 50, 10, -7, -7, 3,
                7, 50 ,50, coords.posX, coords.posY);

    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append(" \t| MP:\t").append(Monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.posX).append(".").append(Monk.super.coords.posY);
    }
}
