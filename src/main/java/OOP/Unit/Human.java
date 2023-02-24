package OOP.Unit;

import java.util.ArrayList;

public abstract class Human implements GameInterfase {
    protected String name;
    protected float hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;
    protected Vector2D coords;

    protected Human(String name, float hp, int maxHp, int attack, int damageMin,
                 int damageMax, int defense, int speed, int posX, int posY) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        coords = new Vector2D(posX, posY);
    }

    public int getAttack() {
        return this.attack;
    }
    public int getDefense() { return this.defense; }
    public int getSpeed() { return this.speed; }
    public float getHp () { return this.hp; }
    public void setHp (float hp) { this.hp = hp; }
    public int getMaxHp () { return this.maxHp;}

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) { }

    public void makeDamage (Human unit) {
        int damage = unit.getDefense() - attack;
        float hp;
        if(damage < 0) {
            hp = unit.getHp() - damageMax;
        } else if (damage > 0) {
            hp = unit.getHp() - damageMin;
        } else {
            hp = unit.getHp() - ((damageMax+damageMin)/2);
        }
        unit.setHp(hp < 0 ? 0: hp);
    }

    protected int findNearest(ArrayList<Human> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }
    public static ArrayList<Human> findLive(ArrayList<Human> team) {
        ArrayList <Human> findLive = new ArrayList<>();
        for (Human human : team) {
            if (human.getHp() > 0) {
                findLive.add(human);
            }
        }
        return findLive;
    }

    @Override
    public StringBuilder getInfo() {
        return null;
    }
}
