package OOP.Unit;
public class Spearman extends Warrior {
    public Spearman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

    public Spearman(String name) {
        super(name, 200, 200, 30, 30, 20, 5);
    }

    public void runAway() {
    }
}
