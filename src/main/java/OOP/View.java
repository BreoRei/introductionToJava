package OOP;

import OOP.Unit.Barrier;
import OOP.Unit.Human;

import java.util.ArrayList;
import java.util.Collections;

public class View {
    private static int step = 1;
    private static final int[] l = {0};
    private static final String top10 = AnsiColors.ANSI_WHITE_BACKGROUND + formatDiv("a") + String.join("", Collections.nCopies(9, formatDiv("--b"))) + formatDiv("--c")+ AnsiColors.ANSI_RESET;
    private static final String midl10 = AnsiColors.ANSI_WHITE_BACKGROUND + formatDiv("d") + String.join("", Collections.nCopies(9, formatDiv("--e"))) + formatDiv("--f")+ AnsiColors.ANSI_RESET;
    private static final String bottom10 = AnsiColors.ANSI_WHITE_BACKGROUND + formatDiv("g") + String.join("", Collections.nCopies(9, formatDiv("--h"))) + formatDiv("--i")+ AnsiColors.ANSI_RESET;
    private static void tabSetter(){
        System.out.print(" \t|\t");
    }
    private static String formatDiv(String str) {
        return str.replace('a', '┌')
                .replace('b', '┬')
                .replace('c', '┐')
                .replace('d', '├')
                .replace('e', '┼')
                .replace('f', '┤')
                .replace('g', '└')
                .replace('h', '┴')
                .replace('i', '┘')
                .replace('-', '─');
    }

    private static String getChar(int x, int y){
        String out = AnsiColors.ANSI_WHITE_BACKGROUND + "|" + (AnsiColors.ANSI_BLACK +"  "+ AnsiColors.ANSI_RESET);
        for (Human human: main.allTeam) {
            if (human.getCoords()[0] == x && human.getCoords()[1] == y){
                if (human.getHp() == 0) {
                    out = AnsiColors.ANSI_WHITE_BACKGROUND + "|" + "\uD83D\uDC80" + AnsiColors.ANSI_RESET;
                    break;
                }
                if (main.darkTeam.contains(human)) out = AnsiColors.ANSI_WHITE_BACKGROUND + "|" + AnsiColors.ANSI_YELLOW_BACKGROUND+(AnsiColors.ANSI_YELLOW + human.getEmoji() + AnsiColors.ANSI_RESET);
                if (main.holyTeam.contains(human)) out = AnsiColors.ANSI_WHITE_BACKGROUND + "|" + AnsiColors.ANSI_GREEN_BACKGROUND+(AnsiColors.ANSI_GREEN + human.getEmoji() + AnsiColors.ANSI_RESET);
                break;
            }
        }
        for (Barrier barrier: main.barrier) {
            if (barrier.getCoords()[0] == x && barrier.getCoords()[1] == y){
                out = AnsiColors.ANSI_WHITE_BACKGROUND + "|" + barrier.getBarrieraEmodji() + AnsiColors.ANSI_RESET;
                break;
            }
        }
        return out;
    }
    static void searchWinner (int teamSize) {
        main.allTeam.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < (l[0]*3-10)/2; i++) System.out.print(AnsiColors.ANSI_PURPLE + "*");
        System.out.printf(AnsiColors.ANSI_CYAN + "%s",
                teamSize == 0? ">>> Победила Yellow side <<<" : ">>> Победила Green side <<<");
        for (int i = 0; i < (l[0]*3-10)/2; i++) System.out.print(AnsiColors.ANSI_PURPLE + "*");
        System.out.println(AnsiColors.ANSI_RESET);
    }
    public static void view() {
        if (step == 1 ){
            System.out.print(AnsiColors.ANSI_RED + "First step" + AnsiColors.ANSI_RESET);
        } else {
            System.out.print(AnsiColors.ANSI_RED + "Step:" + step + AnsiColors.ANSI_RESET);
        }
        step++;
        main.allTeam.forEach((v) -> l[0] = Math.max(l[0], v.toString().length()));
        for (int i = 0; i < l[0]*3; i++) System.out.print("_");
        System.out.println();
        System.out.print(top10 + "\t");
        System.out.print(AnsiColors.ANSI_YELLOW + "Yellow side" + AnsiColors.ANSI_RESET);
        for (int i = 0; i < l[0]-6; i++) System.out.print(" ");
        System.out.println("\t|"+ AnsiColors.ANSI_GREEN + "\tGreen side" + AnsiColors.ANSI_RESET);
        for (int i = 1; i < 11; i++) {
            System.out.print(getChar(1, i));
        }
        System.out.print(AnsiColors.ANSI_WHITE_BACKGROUND + "|" + AnsiColors.ANSI_RESET + "\t");
        System.out.print(AnsiColors.ANSI_YELLOW + main.darkTeam.get(0) + AnsiColors.ANSI_RESET);
        tabSetter();
        System.out.println(AnsiColors.ANSI_GREEN + main.holyTeam.get(0) + AnsiColors.ANSI_RESET);
        System.out.println(midl10);

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(getChar(i, j));
            }
            System.out.print(AnsiColors.ANSI_WHITE_BACKGROUND + "|" + AnsiColors.ANSI_RESET + "\t");
            System.out.print(AnsiColors.ANSI_YELLOW + main.darkTeam.get(i-1) + AnsiColors.ANSI_RESET);
            tabSetter();
            System.out.println(AnsiColors.ANSI_GREEN + main.holyTeam.get(i-1) + AnsiColors.ANSI_RESET);
            System.out.println(midl10);
        }
        for (int j = 1; j < 11; j++) {
            System.out.print(getChar(10, j));
        }
        System.out.print(AnsiColors.ANSI_WHITE_BACKGROUND + "|" + AnsiColors.ANSI_RESET + "\t");
        System.out.print(AnsiColors.ANSI_YELLOW + main.darkTeam.get(9) + AnsiColors.ANSI_RESET);
        tabSetter();
        System.out.println(AnsiColors.ANSI_GREEN + main.holyTeam.get(9) + AnsiColors.ANSI_RESET);
        System.out.println(bottom10);
    }
}