package OOP.Unit;
public class Spearman extends Warrior {
    public Spearman(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax, Integer defense, Integer speed) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
    }

    public Spearman(String name) {
        super(name, 200.f, 200, 30, 5, 6, 5, 4);
    }

    public void runAway() {    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append("\t|\t\t\t|");
    }
}
