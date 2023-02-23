package OOP.Unit;

public class Sniper extends Shooter{

    public Sniper(String name, Vector2D coords) {
        super(name, 110.f, 110, 8, 6, 8, 6,
                8, 0, 5, coords.posX, coords.posY);
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append("\t| Arrows: ").append(Sniper.super.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.posX).append(".").append(Sniper.super.coords.posY);
    }
}
