package OOP.Unit;

public abstract class Shooter extends Human{
    int range;
    int cartridges;

    public Shooter(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.range = range;
        this.cartridges = cartridges;
    }
    public void kill (Warrior Warrior){    }
    public int getCartridges() {
        return this.cartridges;
    }
}
