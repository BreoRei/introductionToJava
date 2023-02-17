package OOP.Unit;

public abstract class Mag extends Human{
    protected int mana;
    protected int maxMana;
    public Mag(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax, Integer defense, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
        this.mana = mana;
        this.maxMana = maxMana;
    }

//    public Integer healing (Integer damage, Human human){ return hp;}

}
