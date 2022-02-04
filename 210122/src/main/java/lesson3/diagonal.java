package lesson3;

import java.util.Arrays;

class Print {
    static void printMas (int[][] masPrint) {
        for (int[] m : masPrint) {
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

public class diagonal {
    public static void main(String[] args) {
        massivII();
    }
    public static void massivII() {
        int[][] masII = new int[5][5];

        for (int i = 0; i < masII.length; i++) {
            for (int j = 0; j < masII.length; j++) {
                masII[i][j] = 8;
            }
        }
        for (int i = 0; i < masII.length; i++) {
                masII[i][i] = 1;
                masII[i][masII.length - i -1] = 1;
        }
        Print.printMas(masII);


       /*for (int i = 0; i < masII.length; i++) {
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
            p++;
            v--;
            System.out.println();
        }*/
        System.out.println("____________________________________");

    }
}
