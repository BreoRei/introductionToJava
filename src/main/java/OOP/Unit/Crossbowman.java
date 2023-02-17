package OOP.Unit;

public class Crossbowman extends Shooter{

    public Crossbowman(String name, Float hp, Integer maxHp, Integer attack, Integer damage,Integer damageMin, Integer damageMax, Integer defense, Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, cartridges, range);
    }

    public Crossbowman(String name) {
        super(name, 110.f, 110, 20, 20, 10, 6,5, 6, 5);
    }

    @Override
    public Integer getAttack() { return attack; }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(Crossbowman.super.name)
                .append("\t| ATK:\t").append(Crossbowman.super.attack)
                .append("\t| HP:\t").append(Crossbowman.super.hp)
                .append("\t| Arrows: ").append(Crossbowman.super.cartridges)
                .append("\t|");
    }
}
