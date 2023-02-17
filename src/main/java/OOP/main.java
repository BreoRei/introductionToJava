package OOP;

import OOP.Unit.*;
import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        ArrayList<Human> holyTeam = new ArrayList<>();
        ArrayList<Human> darkTeam = new ArrayList<>();

        createTeam(holyTeam, 1, 5);
        createTeam(darkTeam, 4, 8);

        sortTeam(holyTeam);
        sortTeam(darkTeam);

        printingHeadlines();
        getTeam(holyTeam);
        printingHeadlines();
        getTeam(darkTeam);
        printingLine();
    }

    static void createTeam (ArrayList team, int start, int end) {
        int units = 10;
        for (int i = 0; i < units; i++) {
            int rnd = new Random().nextInt(start, end);
            switch (rnd) {
                case (1):
                    team.add(new Sniper(getName()));
                    break;
                case (2):
                    team.add(new Bandit(getName()));
                    break;
                case (3):
                    team.add(new Witch(getName()));
                    break;
                case (4):
                    team.add(new Farmer(getName()));
                    break;
                case (5):
                    team.add(new Crossbowman(getName()));
                    break;
                case (6):
                    team.add(new Monk(getName()));
                    break;
                case (7):
                    team.add(new Spearman(getName()));
                    break;
            }
        }
    }
    static void getTeam(ArrayList<Human> team) {
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i).getInfo());
        }
    }
    static void sortTeam (ArrayList<Human> team){
        team.sort((o1, o2) -> o1.getSpeed() - o2.getSpeed());
    }
    static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
    static void printingLine() {
        System.out.println("*************************************************************");
    }
    static void printingHeadlines() {
        System.out.println("*************************************************************");
        System.out.println("Класс       Имя     |    ATK    |      HP       |           |" );
        System.out.println("*************************************************************");
    }
}