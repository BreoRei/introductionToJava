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
}
