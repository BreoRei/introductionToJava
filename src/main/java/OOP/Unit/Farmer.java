package OOP.Unit;

public class Farmer extends Human {
    public Farmer(String name, Float hp, Integer maxHp, Integer attack, Integer damageMin, Integer damageMax, Integer defense, Integer speed) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed);
    }
    public Farmer(String name) {
        super(name, 150.f, 1, 1, 1, 1, 1, 1);
    }
    public void treat(Human human){  }
    public void armiger (Shooter Shooter){  }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Farmer.super.name)
                .append("\t| ATK:\t").append(Farmer.super.attack)
                .append("\t| HP:\t").append(Farmer.super.hp)
                .append("\t|\t\t\t|");
    }
}
