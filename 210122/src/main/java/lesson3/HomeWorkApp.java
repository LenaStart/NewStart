package lesson3;

public class HomeWorkApp {
    public static void main(String[] args) {
        massivOI();
        masssivIOO();
        massivxTwo();
        massivII();
        initialValueLen();
        minMax();
        equals();

    }


    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void massivOI() {
        int [] masIO = {1,0,0,1,1,1,0};
        for (int i = 0; i < masIO.length; i++) {
            if (masIO[i] == 0) {
                masIO[i] = 1;
            } else {
                masIO[i] = 0;
            }
            System.out.print(masIO[i] + " ");
        }
        System.out.println();
        System.out.println("____________________________________");
    }
    //2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    private static void masssivIOO() {
        int [] masIOO = new int[100];
        int n = 1;
        for (int i = 0; i < masIOO.length; i++) {
            masIOO[i] = n++;
            System.out.print(masIOO[i] + " ");
        }
        System.out.println();
        System.out.println("____________________________________");
    }
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;

    private static void massivxTwo() {
        int[] masxTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < masxTwo.length; i++) {
            if (masxTwo[i] < 6) {
                masxTwo[i] = masxTwo[i] * 2;
            }
            System.out.print(masxTwo[i] + " ");
        }
        System.out.println();
        System.out.println("____________________________________");
    }
    //4. Создать квадратный двумерный целочисленный массив,
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами

    private static void massivII() {
        int[][] masII = new int[5][5];
        int p = 0;
        int v = masII.length-1;

       for (int i = 0; i < masII.length; i++) {
            for (int j = 0; j < masII.length; j++) {
                masII[i][j] = 8;
                if (i == p) {
                   if (j == v) {
                       masII[i][j] = 1;
                   }
               }
                if (i == j) {
                    masII[i][j] = 1;
                }
              System.out.print(masII[i][j] + " ");
            }
           System.out.println();
            p++;
            v--;
        }
        System.out.println("____________________________________");
    }
    //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    private static void initialValueLen() {
        int len = 5;
        int initialValue = 77;
        int [] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("____________________________________");
    }
    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    private static void minMax() {
        int[] minmax = {12,56,1,12,33,115,4,-6};
        int max = minmax[0];
        int min = minmax[0];

        for (int num : minmax) {
            if (num > max) {
                max = num;
            }
        }
        for (int num : minmax) {
            if (num < min) {
                min = num;
            }
        }
        System.out.printf("Минимальный элемент массива: %d Максимальный элемент массива: %d %n", max, min);
        System.out.println("____________________________________");
    }
    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

    private static void equals() {
        int[] arr = {1,1,1,3};

        for (int num : arr) {
            
        }
    }


}
