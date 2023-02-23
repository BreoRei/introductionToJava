package OOP.Unit;
public class Spearman extends Warrior {
    public Spearman(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }

    public Spearman(String name, Vector2D coords) {

        super(name, 200.f, 200, 30, 5, 6, 5,
                4, coords.posX, coords.posY);
    }

    public void runAway() {    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append("\t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.posX).append(".").append(Spearman.super.coords.posY);
    }
}
