package OOP;

import OOP.Unit.*;

import java.util.*;

public class main {
    static final int UNITS = 10;
    public static void main(String[] args) {

        ArrayList<Human> holyTeam = new ArrayList<>();
        ArrayList<Human> darkTeam = new ArrayList<>();
        ArrayList<Human> allTeam = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        createTeam(darkTeam, 1, 5, 1);
        createTeam(holyTeam, 4, 8, 10);
        sortTeam(holyTeam);
        sortTeam(darkTeam);
        ArrayList<Human> holyLive = new ArrayList<>(holyTeam);
        ArrayList<Human> darkLive = new ArrayList<>(darkTeam);
        allTeam.addAll(holyLive);
        allTeam.addAll(darkLive);

        while (true) {
            getTeam(holyLive);
            getTeam(darkLive);
            sortTeam(allTeam);
            for (Human human: allTeam) {
                if (holyLive.size() != 0 && darkLive.size() != 0) {
                    if (holyTeam.contains(human)) {
                        human.step(holyLive, darkLive);
                        darkLive = Human.findLive(darkTeam);
                    } else {
                        human.step(darkLive, holyLive);
                        holyLive = Human.findLive(holyTeam);
                    }
                } else {
                    searchWinner(holyLive.size());
                    break;
                }
            }
            user_input.nextLine();
        }
    }
    static void createTeam (ArrayList <Human> team, int start, int end, int posY) {
        for (int i = 0; i < UNITS; i++) {
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
        printingHeadlines();
        for (Human human : team) {
            System.out.println(human.getInfo());
        }
        printingLine();
    }
    static void sortTeam (ArrayList<Human> team) {
        team.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHp() - o1.getHp());
                else return o2.getSpeed() - o1.getSpeed();
            }
        });
    }
    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
    static void printingLine() {
        System.out.println("*****************************************************************************");
    }
    static void printingHeadlines() {
        System.out.println("*****************************************************************************");
        System.out.println("Класс       Имя     |    ATK    |      HP       |           |  coordinates  |" );
        System.out.println("*****************************************************************************");
    }
    static void searchWinner (int teamSize) {
        System.out.println("*************************************************************\t");
        System.out.println("*                                                           *\t");
        System.out.println("*                                                           *\t");
        System.out.println("*                                                           *\t");
        System.out.println("*                                                           *\t");
        System.out.printf("*                  %s                   *%n",
                teamSize == 0? "Победила команда Тьмы " : "Победила команда Света");
        System.out.println("*                                                           *\t");
        System.out.println("*                                                           *\t");
        System.out.println("*                                                           *\t");
        System.out.println("*                                                           *\t");
        System.out.println("*************************************************************\t");

    }
}