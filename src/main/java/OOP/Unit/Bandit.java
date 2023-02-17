package OOP.Unit;

public class Bandit extends Warrior{
    int disguise;

    public Bandit(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax, Integer defense, Integer speed, Integer disguise) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
        this.disguise = disguise;
    }

    public Bandit(String name) {
        super(name, 200.f, 200, 30, 30, 20, 5, 5);
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
                .append("\t|\t\t\t|");
    }
}
