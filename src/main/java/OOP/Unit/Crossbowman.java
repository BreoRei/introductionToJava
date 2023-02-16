package OOP.Unit;

public class Crossbowman extends Shooter{

    public Crossbowman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damage, protection, speed, cartridges, range);
    }

    public Crossbowman(String name) {
        super(name, 110, 110, 20, 20, 10, 1,5, 6);
    }

    @Override
    public Integer getAttack() { return attack; }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик: ").append(Crossbowman.super.name)
                .append(" HP: ").append(Crossbowman.super.hp)
                .append(" ATK: ").append(Crossbowman.super.attack)
                .append(" cartridges: ").append(Crossbowman.super.cartridges);
    }
}
