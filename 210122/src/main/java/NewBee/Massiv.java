package NewBee;

import java.util.Scanner;

public class Massiv {
    public static void main (String[] args) {

        String[] sm = {"A", "B", "C", "D"};
        for (String o : sm) {
            System.out.print(o + " ");
        }

        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                counter++;
            }

        }
        printArr(table);

    }
    public static void printArr (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "/t");
            }
            System.out.println();
        }
    }

        /*Scanner userInput = new Scanner(System.in);
        System.out.println("Введите ограничение: ");
        int limit = userInput.nextInt();

        userInput.close();

        int counter = 0;
        System.out.println("Список четных чисел из заданного промежутка: ");
        while (counter <= limit) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }*/


        /*int[] arr = new int[5];
        int i = 0;
        arr[i] = i++;
        arr[i] = i++;
        arr[i] = i++;
        arr[i] = i++;
        arr[i] = i++;*/

       /* int[] nums = new int[4];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 15;*/

     /*   int[] nums = {5,10,15,20};

        System.out.println(nums[2]);*/


    //}
}
