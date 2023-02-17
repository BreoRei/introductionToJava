package OOP.Unit;

public abstract class Human implements GameInterfase{
    protected String name;
    protected Float hp;
    protected Integer maxHp;
    protected Integer attack;
    protected Integer damageMin;
    protected Integer damageMax;
    protected Integer defense;
    protected Integer speed;

    public Human(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax, Integer defense, Integer speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
    }

    public Integer getAttack() {
        return attack;
    }
    public Integer getDefense() { return defense; }
    public Integer getDamageMin() { return damageMin; }

    public Integer getDamageMax() { return damageMax; }
    public Integer getSpeed() { return speed; }

    @Override
    public void step() {}

//    @Override
//    public StringBuilder getInfo() {
//        return null;
//    }
}
