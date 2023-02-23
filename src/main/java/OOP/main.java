package OOP;

import OOP.Unit.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        ArrayList<Human> holyTeam = new ArrayList<>();
        ArrayList<Human> darkTeam = new ArrayList<>();
        ArrayList<Human> allTeam = new ArrayList<>();
        String game = "";
        Scanner user_input = new Scanner(System.in, "Cp1251");
        createTeam(holyTeam, 1, 5, 1);
        createTeam(darkTeam, 4, 8, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(holyTeam);
        sortTeam(darkTeam);
        sortTeam(allTeam);

        while (game == "") {
            if (Human.findLive(holyTeam).size() != 0 && Human.findLive(darkTeam).size() != 0) {
                getTeam(holyTeam);
                getTeam(darkTeam);
                allTeam.forEach(n->n.step(Human.findLive(holyTeam),Human.findLive(darkTeam)));//
                game = user_input.nextLine();
            } else {
                searchWinner(holyTeam, darkTeam);
                break; }
        }
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
        printingHeadlines();
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i).getInfo());
        }
        printingLine();
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
    static void searchWinner (ArrayList<Human> holyTeam, ArrayList<Human> darkTeam) {
        int holySize = Human.findLive(holyTeam).size();
        int darkSize = Human.findLive(darkTeam).size();
        System.out.println(holySize > darkSize?"Победила команда Света":"Победила команда Тьмы");
    }
}