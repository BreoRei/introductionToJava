package OOP;

import OOP.Unit.*;


import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        ArrayList<Human> holyTeam = new ArrayList<>();
        ArrayList<Human> darkTeam = new ArrayList<>();


        createTeam(holyTeam, 1, 5, 1);
        createTeam(darkTeam, 4, 8, 10);
        ArrayList<Human> allTeam = new ArrayList<>();
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);

        sortTeam(holyTeam);
        sortTeam(darkTeam);
        sortTeam(allTeam);


        printingHeadlines();
        getTeam(holyTeam);
        printingHeadlines();
        getTeam(darkTeam);
        printingLine();
//        printingHeadlines();
//        getTeam(allTeam);

//        teams.forEach(n->n.step(findLive(team1),team2));

        Human.findLive(holyTeam);
        Human.findLive(darkTeam);
        holyTeam.get(0).step(holyTeam, darkTeam);

        printingHeadlines();
        getTeam(holyTeam);
        printingHeadlines();
        getTeam(darkTeam);
        printingLine();
//        Farmer d = new Farmer("f", new Vector2D(1,3));


    }

    static void createTeam (ArrayList team, int start, int end, int posY) {
        int units = 10;
        for (int i = 0; i < units; i++) {
            int rnd = new Random().nextInt(start, end);
            switch (rnd) {
                case (1):
                    team.add(new Sniper(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (2):
                    team.add(new Bandit(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Witch(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (4):
                    team.add(new Farmer(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (5):
                    team.add(new Crossbowman(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Monk(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (7):
                    team.add(new Spearman(getName(), new Vector2D(i + 1, posY)));
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
        team.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());
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