package OOP;

import OOP.Unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
public class main {
    static final int UNITS = 10;
    public static void main(String[] args) {

        ArrayList<Human> holyTeam = new ArrayList<>();
        ArrayList<Human> darkTeam = new ArrayList<>();
        ArrayList<Human> allTeam = new ArrayList<>();
        String game = "";
        Scanner user_input = new Scanner(System.in);
        createTeam(holyTeam, 1, 5, 1);
        createTeam(darkTeam, 4, 8, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(holyTeam);
        sortTeam(darkTeam);
        sortTeam(allTeam);



        while (game == "") {
            if (Human.findLive(holyTeam).size() != 0 && Human.findLive(darkTeam).size() != 0) {
                sortTeam(holyTeam);
                sortTeam(darkTeam);
                getTeam(holyTeam);
                getTeam(darkTeam);
                for (Human human: allTeam) {
                    if (holyTeam.contains(human)) {
                        human.step(Human.findLive(holyTeam), Human.findLive(darkTeam));
                    } else {
                        human.step(Human.findLive(darkTeam), Human.findLive(holyTeam));
                    }
                }
//                allTeam.forEach(n-> holyTeam.contains(n)?n.step(Human.findLive(holyTeam),Human.findLive(darkTeam)):
//                        n.step(Human.findLive(darkTeam),Human.findLive(holyTeam)));
                game = user_input.nextLine();
            } else {
                searchWinner(holyTeam, darkTeam);
                break; }
        }
    }
    static void createTeam (ArrayList team, int start, int end, int posY) {
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
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i).getInfo());
        }
        printingLine();
    }
    static void sortTeam (ArrayList<Human> team){
        team.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHp() - o1.getHp());
                else return o2.getSpeed() - o1.getSpeed();
            }
        });
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
    static void searchWinner (ArrayList<Human> holyTeam, ArrayList<Human> darkTeam) {
        int holySize = Human.findLive(holyTeam).size();
        int darkSize = Human.findLive(darkTeam).size();
        System.out.println(holySize > darkSize?"Победила команда Света":"Победила команда Тьмы");
    }
}