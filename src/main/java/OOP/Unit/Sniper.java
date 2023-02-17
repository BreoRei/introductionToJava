package OOP.Unit;

public class Sniper extends Shooter{
    public Sniper(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax, Integer defense,
                  Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, cartridges, range);
    }

    public Sniper(String name) {
        super(name, 110.f, 110, 20, 6, 7, 6,6, 6, 5);
    }

    @Override
    public Integer getAttack() {
        return attack;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append("\t| Arrows: ").append(Sniper.super.cartridges)
                .append("\t|");
    }
}
