package OOP.Unit;

public abstract class Warrior extends Human{

    public Warrior(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

    //    Атака ближнего боя
    @Override
    public Integer getAttack() {
        return attack;
    }
}
