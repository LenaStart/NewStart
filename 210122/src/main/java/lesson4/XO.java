package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class XO {

    //блок настроек игры
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static int SIZE = 3; // размерность поля
    private static final char DOT_EMPTY = '●'; //свободное поле
    private static final char DOT_X = 'X'; //крестик
    private static final char DOT_O = '0';//нолик
    private static char[][] map = new char[SIZE][SIZE]; //матрица игры
    private static final char NOOK = '►'; //угловой символ
    private static final String BETWEEN = " "; //промежуточный символ
    //private static int numberOfMoves;


    public static void start() {
        fillMap(); //заполняем матрицу
        printMap(); //выводим на экран
        startGame(); //запуск игры
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

        System.out.print(NOOK + BETWEEN);
        for (int i = 0; i < SIZE; i++) {
            col[i] = i+1;
            System.out.print(col[i] + BETWEEN);
        }
    }

    private static void printMapSide() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + BETWEEN);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + BETWEEN);
            }
            System.out.println();
        }
    }

    private static void startGame() {
            while (true) {
                playerTurn(); //1. ход игрока
                printMap();  //2. вывод на печать
                if (testFin(DOT_X)) {// 3. проверка окончания
                    break;
                }
                compTurn(); // 4. ход компьютера
                printMap();  //5. вывод на печать
                if (testFin(DOT_O)) {// 6. проверка окончания
                    break;
                }
                //playerTurn(); // 7. возврат к 1
            }
    }

    private static void playerTurn() {
        int lineNum; //координата строки
        int columnNum; //координата столбца

        System.out.println("Ход игрока");
        while (true) {
            lineNum = chekTurnPlayer() - 1;
            columnNum = chekTurnPlayer() - 1;

            if (itIsEmpty(lineNum, columnNum)) {
                break;
            } else {
                System.out.println("Поле занято, попробуйте другие координаты");
            }
        }
        map[lineNum][columnNum] = DOT_X;
        //numberOfMoves++;
    }

    private static int chekTurnPlayer() {
        while (true) {
            System.out.print("Введите координаты хода от 1 до " + SIZE + " ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (n >= 1 && n <= SIZE) {
                    return n;
                }
                System.out.println("Неверные координаты, нужны числа от 1 до " + SIZE);
            } else {
                in.next();
                System.out.println("Неверные координаты, нужны только целые числа");
            }
        }
    }

    private static void compTurn() {
        System.out.println("Ход компьютера");
        int lineNum;
        int columnNum;
        while (true) {
            lineNum = random.nextInt(SIZE);
            columnNum = random.nextInt(SIZE);

                if (itIsEmpty(lineNum, columnNum)) {
                    break;
                }
        }

        /*do {
            lineNum = random.nextInt(SIZE);
            columnNum = random.nextInt(SIZE);
        } while (!itIsEmpty(lineNum, columnNum));*/

        map[lineNum][columnNum] = DOT_O;
        //numberOfMoves++;
    }

    private static boolean itIsEmpty(int lineNum, int columnNum) {
        return map[lineNum][columnNum] == DOT_EMPTY;
    }

    private static boolean testFin(char s) {
        if (victory(s)){
            if (s == DOT_X) {
                System.out.println("Игрок победил.");
            } else {
                System.out.println("Победил компьютер.");
            }
            return true;
        }
        if (standoff(s)){
            System.out.println("Ничья.");
            return true;
        }
        return false;
    }

    private static boolean victory(char s) {
        
        return false;
    }

    private static boolean standoff(char s) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
        //return numberOfMoves >= SIZE * SIZE;
    }



   /*private static boolean testFin() {
       while (true) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        break;
                    }
                }
            }
        }
        //System.out.println("Игра окончена");
    }*/



}

