package lesson3;

public class TestMass {
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
        }

    }
}
