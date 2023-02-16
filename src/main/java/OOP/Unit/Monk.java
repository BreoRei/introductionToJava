package OOP.Unit;

public class Monk extends Mag{

    int FreezeStep;
    public Monk(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
        this.FreezeStep = FreezeStep;
    }
    public Monk(String name) {
        super(name, 130, 130, 15, 15, 5, 1, 6, 6 );
        this.FreezeStep = 7;
    }
    public Integer FreezeWitch(Witch witch){
        return FreezeStep;
    }
}
