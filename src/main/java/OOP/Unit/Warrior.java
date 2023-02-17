package OOP.Unit;

public abstract class Warrior extends Human{

    public Warrior(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax, Integer defense, Integer speed) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
    }

    //    Атака ближнего боя
    @Override
    public Integer getAttack() {
        return attack;
    }
}
