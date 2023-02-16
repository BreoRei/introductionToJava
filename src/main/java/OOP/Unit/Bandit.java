package OOP.Unit;

public class Bandit extends Warrior{
    int disguise;

    public Bandit(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, Integer disguise) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.disguise = disguise;
    }

    public Bandit(String name) {
        super(name, 200, 200, 30, 30, 20, 5);
        this.disguise = 50;
    }

    public void steal(int disguise, Shooter Shooter) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: ").append(Bandit.super.name)
                .append(" HP: ").append(Bandit.super.hp)
                .append(" ATK: ").append(Bandit.super.attack);
    }
}
