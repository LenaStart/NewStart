package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class XO {

    //блок настроек игры
    private static int SIZE = 3; // размерность поля
    private static final char DOT_EMPTY = '●'; //свободное поле
    private static final char DOT_X = 'X'; //крестик
    private static final char DOT_O = 'Ѻ';//нолик
    private static char[][] map = new char[SIZE][SIZE]; //матрица игры
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static char nook = '►';
    private static String between = " ";

    public static void start() {
        fillMap(); //заполняем матрицу
        printMap(); //выводим на экран

    }

    private static void fillMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapUp();
        printMapSide();
    }

    private static void printMapUp() {
        int col[] = new int [SIZE];

        System.out.print(nook + between);
        for (int i = 0; i < SIZE; i++) {
            col[i] = i+1;
            System.out.print(col[i] + between);
        }
    }

    private static void printMapSide() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + between);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + between);
            }
            System.out.println();
        }
    }


}
