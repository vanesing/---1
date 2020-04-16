package ru.geekbrains.project1.lessionone;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int fieldSizeY;
    private static int fieldSizeX;
    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '.';

    // init field
    private static void initMap() {
        fieldSizeY = 3;
        fieldSizeX = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = EMPTY_DOT;
            }
        }
    }

    // print field
    private static void printMap() {
        System.out.println("-------");
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print("|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    // human turn
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.printf("Введите координаты хода X и Y (от 1 до %d) через пробел: ", fieldSizeX);
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!(isEmptyCell(y, x) && isValidCell(y, x)));
        field[y][x] = HUMAN_DOT;
    }

    // is cell empty
    private static boolean isEmptyCell(int y, int x) {
        return field[y][x] == EMPTY_DOT;
    }

    // is cell valid
    private static boolean isValidCell(int y, int x) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    // ai turn
    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(y, x));
        field[y][x] = AI_DOT;
    }

    // check win
    private static boolean checkWin(char c) {

        int run ;
        int toWin =3;
        int countDia =0;
        int countDia1 =0;

        for (run=0;run<3;run++) {
            if (checkLine(c,run)==toWin){
               return true;
            }

            if ((field[run][run]) == HUMAN_DOT) {
                countDia++;
                if (countDia==toWin){
                    return true;
                }

            }

            if ((field[2-run][run]) == HUMAN_DOT) {
                countDia1++;
                if (countDia1==toWin){
                    return true;
                }

            }

        }
        return false;
    }

     private static int checkLine (char c, int l){
        int countHor=0;
        int countver=0;


         for (int x =0; x<3; x++ ){
             if ((field[l][x]) ==HUMAN_DOT){
                 countHor++;
             }
         }
         for (int y =0; y<3; y++ ){
             if ((field[y][l]) ==HUMAN_DOT){
                 countver++;
             }
         }


        if (countHor==3){
            return countHor;
        }
         if (countver==3){
             return countver;
         }
     return 0;
    }




    // check draw
    private static boolean isMapFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isEmptyCell(y, x)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();

                if (gameChecks(HUMAN_DOT, "Human win!")) break;
                aiTurn();
                printMap();
                if (gameChecks(AI_DOT, "AI win!")) break;
            }
            System.out.println("Play again?");
            if (!SCANNER.next().equals("Y"))
                break;
        }
        SCANNER.close();

        int[] arr = {1,2,3,4,5,6,7};
        arraySum("Hello", 0, arr);
        arraySum("Hello", 0, new int[] {1,2,3,4,5,6,7});
        arraySum("Hello", 0, 1,2,3,4,5,6,7);
    }

    private static int arraySum(String s, int b, int... a) {
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            r += a[i];
        }
        return r;
    }

    private static boolean gameChecks(char aiDot, String s) {
        if (checkWin(aiDot)) {
            System.out.println(s);
            return true;
        }
        if (isMapFull()) {
            System.out.println("draw!");
            return true;
        }
        return false;
    }
}
