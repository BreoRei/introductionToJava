package OOP;

import OOP.Unit.*;

import java.util.*;

public class main {
    static final int UNITS = 10;
    public static ArrayList<Human> allTeam = new ArrayList<>();
    public static ArrayList<Human> holyTeam = new ArrayList<>();
    public static ArrayList<Human> darkTeam = new ArrayList<>();

    public static void main(String[] args) {

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
            View.view();
            user_input.nextLine();
            sortTeam(allTeam);
            for (Human human: allTeam) {
                if (holyLive.size() != 0 && darkLive.size() != 0) {
                    if (holyTeam.contains(human)) {
                        human.step(holyLive, darkLive);
                        darkLive = findLive(darkTeam);
                    } else {
                        human.step(darkLive, holyLive);
                        holyLive = findLive(holyTeam);
                    }
                } else {
                    View.searchWinner(holyLive.size());
                    return;
                }
            }
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
    static void sortTeam (ArrayList<Human> team) {
        team.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o2.getSpeed() == o1.getSpeed()) return (int) (o2.getHp() - o1.getHp());
                else return o2.getSpeed() - o1.getSpeed();
            }
        });
    }
    static ArrayList<Human> findLive(ArrayList<Human> team) {
        ArrayList <Human> findLive = new ArrayList<>();
        for (Human human : team) {
            if (human.state.equals("Stand")|| human.state.equals("Empty")) {
                findLive.add(human);
            }
        }
        return findLive;
    }
    static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}