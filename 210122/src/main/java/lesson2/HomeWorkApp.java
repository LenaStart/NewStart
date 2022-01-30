package lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
        public static void main (String[] args) {
            System.out.println(numberСheck(1, 15));

            System.out.println(posNegNum(ThreadLocalRandom.current().nextInt()));

            System.out.println(posNegNumBool(0));
            System.out.println(posNegNumBool(-10));
            System.out.println(posNegNumBool(13));

            printStr("Скорей бы лето");

            System.out.println(god(1444));

        }
    //1. Проверка суммы переменных и возврат результата проверки булево
            public static boolean numberСheck (int a, int b) {
                return a+b >= 10 && a+b <= 20;
            }
        //2. Положительное число или отрицательное
            public static String posNegNum(int i) {
                return i >=0 ? "Число положительное " + i : "Число отрицательное " + i;
            }
        //3. Положительное число или отрицательное, вернуть булево
            public static boolean posNegNumBool(int i) {
                return i >=0;
            }

        //4. Отпечатать в консоль указанную строку, указанное количество раз
            public static void printStr(String s) {
               for (int i = 2; i > 0; i--) {
                    System.out.println(s);
               }
            }

        //5. Определяет, является ли год високосным, выводит булево
            public static boolean god (int g) {
                return g % 4 == 0 || g % 100 !=0 && g % 400 == 0;
            }
    }
