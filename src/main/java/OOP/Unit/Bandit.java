package OOP.Unit;

public class Bandit extends Warrior {

    public Bandit(String name, Vector2D coords) {
        super(name, 70.f, 70, 10, 2, 6, 7,
                6, coords.posX, coords.posY);
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Bandit.super.name)
                .append("\t| ATK:\t").append(Bandit.super.attack)
                .append("\t| HP:\t").append(Bandit.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Bandit.super.coords.posX).append(".").append(Bandit.super.coords.posY);
    }
}
