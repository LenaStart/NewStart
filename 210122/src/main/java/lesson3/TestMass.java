package lesson3;

import java.util.Arrays;

public class TestMass {
    public static void main(String[] args) {
        testArreyOne();
        testArreyTwo();
        zapolnit8();
        diagonsl();
    }

    public static void testArreyOne() {
        int[] arrOne = new int[3];

        arrOne[0] = 5;
        arrOne[1] = 2;
        arrOne[2] = 8;

        System.out.println(arrOne[0]);
        System.out.println(arrOne[1]);
        System.out.println(arrOne[2]);
        //System.out.println(arrOne);
    }

    private static void testArreyTwo() {
        int [][] arrTwo = new int [9][9];
        int n = 1;

        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {
                arrTwo[i][j] = n++;
                /*if (arrTwo[i][j] < 10) {
                    System.out.print(arrTwo[i][j] + "  ");
                }*/
            }
        }

        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {
                System.out.printf("%2d ", arrTwo[i][j]);
            }
            System.out.println();
        }System.out.println("__________________________________________________");
    }

    //2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    private static void zapolnit8() {
        int[] rrr = new int[8];
        //int m = 0;
        /*for (int m:rrr) {
            rrr
            System.out.print(m);
        }*/
        //int n = 0;
        int d = 0;
        for (int i = 0; i < rrr.length; i++) {
            rrr[i] = rrr[i] + d;
            d = d + 3;
            System.out.print(rrr[i] + " ");
        }
        //решение из урока
        for (int i = 0; i < rrr.length; i++) {
            rrr[i] = i * 3;
           // System.out.print(rrr[i]);

        }
        Util.printArray(rrr);
        System.out.println();
        System.out.println("_____________________________________________");
    }

    //заполнить диаглгали 1
    private static void diagonsl() {
        int d = 5;
        int [][] dd = new int[d][d];

        for (int i = 0; i < dd.length; i++) {
            dd[i][i] = 1;
            dd[i][dd.length - i - 1] = 1;
        }
        Util.printArray(dd);
        System.out.println();
        System.out.println("_____________________________________________");
    }


}
