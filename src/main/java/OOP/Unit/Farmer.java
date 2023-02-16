package OOP.Unit;

public class Farmer extends Human {
    public Farmer(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }
    public Farmer(String name) {
        super(name, 150, 150, 2, 2, 2, 2);
    }
    public void treat(Human human){  }
    public void armiger (Shooter Shooter){  }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: ").append(Farmer.super.name)
                .append(" HP: ").append(Farmer.super.hp)
                .append(" ATK: ").append(Farmer.super.attack);
    }
}
