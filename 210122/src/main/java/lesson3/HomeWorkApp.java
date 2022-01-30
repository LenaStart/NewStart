package lesson3;

public class HomeWorkApp {
    public static void main(String[] args) {
        testArreyOne();
        testArreyTwo();
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
        int [][] arrTwo = new int [3][3];

        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {
                System.out.print(arrTwo[i][j] + " ");
            }
        }

    }


}
