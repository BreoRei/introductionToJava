package OOP.Unit;

public class Witch extends Mag{

    public Witch(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax,
                 Integer defense, Integer speed, Integer mana, Integer maxMana) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, mana, maxMana);
    }
    public Witch(String name) {
        super(name, 130.f, 130, 15, 15, 5, 2, 60, 6 ,5);
    }

    @Override
    public Integer getAttack() {
        return attack;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Witch.super.name)
                .append("\t| ATK:\t").append(Witch.super.attack)
                .append("\t| HP:\t").append(Witch.super.hp)
                .append("\t| MP:\t").append(Witch.super.mana)
                .append("\t|");
    }
}
