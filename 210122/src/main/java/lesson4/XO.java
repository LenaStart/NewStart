package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class XO {

    //блок настроек игры
    private static final Scanner in = new Scanner(System.in); // ход игрока
    private static final Random random = new Random(); // ход компьютера
    private static int SIZE; // размерность поля
    private static int winSize; // кол-во ячеек одного символа подряд для победы
    private static final char DOT_EMPTY = '●'; //свободное поле
    private static final char DOT_X = 'X'; //крестик
    private static final char DOT_O = '0';//нолик
    private static char[][] map; //матрица игры
    private static final char NOOK = '►'; //угловой символ
    private static final String BETWEEN = " "; //промежуточный символ
    //private static int numberOfMoves;
    private static int lastX;
    private static int lastY;




    public static void start() {
        do {
            init(); //размерность игрового поля
            printMap(); //выводим на экран
            startGame(); //запуск игры
        }
        while (continueGame());
            finGame();

    }

    private static void init() {
        Scanner it = new Scanner(System.in);
        System.out.println("Задайте размер игрового поля от 3 до 9");
        SIZE = it.nextInt();
        spotWinSize(); //установка кол-во ячеек одного символа подряд для победы
        //SIZE = 3;
        map  = new char[SIZE][SIZE];  //инициализация матрицы игры
        fillMap(); //заполняем игровое поле
    }

    private static void spotWinSize() {
        if (SIZE <= 5 && SIZE >= 3) {
            winSize = 3;
        } else if (SIZE <= 6 && SIZE >= 10) {
            winSize = 4;
        } else {
            winSize = 5;
        }
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
            //System.out.printf("%2d%c",i + 1, BETWEEN);
        }
    }

    private static void printMapSide() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + BETWEEN);
            for (int j = 0; j < SIZE; j++) {
                /*if (j <= 8) {
                    System.out.printf("%2d ", map[i][j]);
                } else*/
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
        lastX = lineNum;
        lastY = columnNum;
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
        lastX = lineNum;
        lastY = columnNum;
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
        if (standoff()){
            System.out.println("Ничья.");
            return true;
        }
        return false;
    }

    private static boolean victory(char s) {
        //System.out.printf("координата Х - %d, координата У - %d%n",lastX, lastY);
        int n = 0;
        int firstSymbolI;
        int firstSymbolJ;

        if (chekXLineWinPlayer(n) || chekXColWinPlayer(n)) {
            return true;
        } else if (chekXColWinComp(n) || chekXLineWinComp())
        return false;
        /*for (int i = lastX; i == 0; i--) {
            for (int j = lastY; j == 0; j-- ) {
                if (i == 0 || j == 0) {
                    firstSymbolI = i;
                    firstSymbolJ = j;
                }
            }
        }return true;*/

            /*if (map[lastX][lastY] == DOT_X) {
                for (int i = 0; i < SIZE; i++) {
                    if (map[i][lastY] == DOT_X) {
                        n++;
                    } else if (map[lastX][i] == DOT_X) {
                        n++;
                    } else {
                        n = 0;
                    }
                    if (n == winSize) {

                        return true;
                    }
                }
            }*/

        return ;
    }

    private static boolean chekXLineWinComp(int n) {
        if (map[lastX][lastY] == DOT_O) {
            for (int i = 0; i < SIZE; i++) {
                if (map[lastX][i] == DOT_O) {
                    n++;
                } else {
                    n = 0;
                }
                if (n == winSize) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean chekXColWinComp(int n) {
        if (map[lastX][lastY] == DOT_O) {
            for (int i = 0; i < SIZE; i++) {
                if (map[i][lastY] == DOT_O) {
                    n++;
                } else {
                    n = 0;
                }
                if (n == winSize) {
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean chekXColWinPlayer(int n) {
        if (map[lastX][lastY] == DOT_X) {
            for (int i = 0; i < SIZE; i++) {
                if (map[i][lastY] == DOT_X) {
                    n++;
                } else {
                    n = 0;
                }
                if (n == winSize) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean chekXLineWinPlayer(int n) {
        if (map[lastX][lastY] == DOT_X) {
            for (int i = 0; i < SIZE; i++) {
                if (map[lastX][i] == DOT_X) {
                    n++;
                } else {
                    n = 0;
                    }
                if (n == winSize) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean standoff() {
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

    private static boolean continueGame() {
        System.out.println("Продолжаем? y/n");
        return switch (in.next()) {
            case "y", "да", "yes", "ok", "хочу" -> true;
            default -> false;
        };
    }

    private static void finGame() {
        in.close();
        System.out.println("Игра окончена");
    }

    /*public static int getWinSize() {
        return winSize;
    }*/

    /*public static void setWinSize(int winSize) {
        XO.winSize = winSize;
    }*/
}

