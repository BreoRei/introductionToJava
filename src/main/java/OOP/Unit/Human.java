package OOP.Unit;

public abstract class Human implements GameInterfase{
    protected String name;
    protected Integer hp;
    protected Integer maxHp;
    protected Integer attack;
    protected Integer damage;
    protected Integer protection;
    protected Integer speed;

    public Human(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damage = damage;
        this.protection = protection;
        this.speed = speed;
    }

    public Integer getAttack() {
        return attack;
    }
    public Integer getProtection() { return protection; }
    public Integer getDamage() { return damage; }

    @Override
    public void step(int a) {

    }
}
