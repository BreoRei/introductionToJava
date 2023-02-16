package OOP.Unit;

public abstract class Mag extends Human{
    protected int mana;
    protected int maxMana;
    public Mag(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    public Integer healing (Integer damage, Human human){ return hp;}

}
