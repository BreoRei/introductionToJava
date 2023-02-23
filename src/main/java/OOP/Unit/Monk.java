package OOP.Unit;

public class Monk extends Mag{

    int FreezeStep;
    public Monk(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                int defense, int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, mana, maxMana, posX, posY);
        this.FreezeStep = FreezeStep;
    }
    public Monk(String name, Vector2D coords) {
        super(name, 130.f, 130, 15, 15, 5, 2,
                60, 6 ,5, coords.posX, coords.posY);
        this.FreezeStep = 7;
    }
    public int FreezeWitch(Witch witch){
        return FreezeStep;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append("\t| MP:\t").append(Monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.posX).append(".").append(Monk.super.coords.posY);
    }
}
