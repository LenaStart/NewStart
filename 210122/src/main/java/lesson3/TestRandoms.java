package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestRandoms {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        testRandoms();
        testConsolInput();


    }

    public static void testRandoms() {
        int[] data = new int[40];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(); //-2 147кк - + 2 147кк
            data[i] = random.nextInt(10);//0 - 9
            data[i] = random.nextInt(8) + 3;//3 - 10, в сумме 8 чисел, +3 чтобы сдвинуть от 0
            data[i] = random.nextInt(3, 11);//3 - 10, от 3 до 11 (невключительно)
            data[i] = random.nextInt(-5, 7);//-5 - +6, 7(невключительно)
            data[i] = random.nextInt(12) - 5;//-5 - +6, всего 12 (диапазон), сдвиг от 0 на -5

            data[i] = (int)(Math.random() * 10);
            data[i] = (int)(Math.random() * 8) + 3; //3-10
            data[i] = (int)(Math.random() * 12) - 5;// -5 - +6

        }

        System.out.println(Arrays.toString(data));
    }

    public static void testConsolInput() {
        Scanner in = new Scanner(System.in);

        //int a = in.nextInt();
        //int b = in.nextInt();
        int a = getNumFromScanner();
        int b = getNumFromScanner();

        in.close();

        TestMetods.multuply(a, b);

    }

    private static int getNumFromScanner() {
        while (true) {
            if (in.hasNextInt()) {
                return  in.nextInt();
            }
            //String str = in.next();
            System.out.println(in.next() + " - это не число!!!");
        }
        //return -1;
    }
}
