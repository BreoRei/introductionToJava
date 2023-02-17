package OOP.Unit;

public abstract class Shooter extends Human{
    int range;
    int cartridges;

    public Shooter(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax, Integer defense, Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
        this.range = range;
        this.cartridges = cartridges;
    }

    @Override
    public void step() {
        int cart = getCartridges();
        if (cart > 0) {
            setCartridges(cart-1);
        }
    }
    public int getCartridges() {
        return this.cartridges;
    }

    public void setCartridges(int cartridges) {
        this.cartridges = cartridges;
    }
}
