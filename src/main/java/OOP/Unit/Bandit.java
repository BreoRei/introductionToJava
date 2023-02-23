package OOP.Unit;

public class Bandit extends Warrior {
    int disguise;

    public Bandit(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int disguise, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.disguise = disguise;
    }

    public Bandit(String name, Vector2D coords) {
        super(name, 200.f, 200, 30, 30, 20, 5, 5, coords.posX, coords.posY);
        this.disguise = 50;
    }

    public void steal(int disguise, Shooter Shooter) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Bandit.super.name)
                .append("\t| ATK:\t").append(Bandit.super.attack)
                .append("\t| HP:\t").append(Bandit.super.hp)
                .append("\t|\t\t\t|").append("\t| (X.Y) : ").append(Bandit.super.coords.posX).append(".").append(Bandit.super.coords.posY);
    }
}
