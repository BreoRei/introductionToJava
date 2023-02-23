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
    protected Farmer farmer;

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
        return attack;
    }
    public int getDefense() { return defense; }
    public int getSpeed() { return speed; }
    public float getHp () { return hp; }
    public float setHp (float p) { return hp-p; }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) { }


    public void makeDamage (Human unit) {}

    public int findNearest(ArrayList<Human> team){
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
        ArrayList findLive = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getHp() > 0 ) {
                findLive.add(team.get(i));
            }
        }
        return findLive;
    }

    @Override
    public StringBuilder getInfo() {
        return null;
    }
}
