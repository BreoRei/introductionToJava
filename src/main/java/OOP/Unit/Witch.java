package OOP.Unit;

public class Witch extends Mag{

    public Witch(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                 Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
    }
    public Witch(String name) {
        super(name, 130, 130, 15, 15, 5, 1, 6, 6 );
    }

    @Override
    public Integer getAttack() {
        return attack;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: ").append(Witch.super.name)
                .append(" HP: ").append(Witch.super.hp)
                .append(" MP ").append(Witch.super.mana)
                .append(" ATK: ").append(Witch.super.attack);
    }
}
