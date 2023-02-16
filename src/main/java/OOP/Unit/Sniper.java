package OOP.Unit;

public class Sniper extends Shooter{
    public Sniper(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection,
                  Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damage, protection, speed, cartridges, range);
    }

    public Sniper(String name) {
        super(name, 110, 110, 20, 20, 10, 1,5, 6);
    }

    @Override
    public Integer getAttack() {
        return attack;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер: ").append(Sniper.super.name)
                .append(" HP: ").append(Sniper.super.hp)
                .append(" ATK: ").append(Sniper.super.attack).
                append(" cartridges: ").append(Sniper.super.cartridges);
    }
}
