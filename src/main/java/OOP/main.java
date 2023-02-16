package OOP;

import OOP.Unit.*;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        ArrayList<Human> humans = new ArrayList<>();

        int units = 10;

        for (int i = 0; i < units; i++) {
            int rnd = new Random().nextInt(1,8);
            switch (rnd) {
                case (1):
                    humans.add(new Farmer(getName()));
                    break;
                case (2):
                    humans.add(new Bandit(getName()));
                    break;
                case (3):
                    humans.add(new Spearman(getName()));
                    break;
                case (4):
                    humans.add(new Sniper(getName()));
                    break;
                case (5):
                    humans.add(new Crossbowman(getName()));
                    break;
                case (6):
                    humans.add(new Monk(getName()));
                    break;
                case (7):
                    humans.add(new Witch(getName()));
                    break;
            }
        }
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i).getInfo());
        }
    }
    public static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
