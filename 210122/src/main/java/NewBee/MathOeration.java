package NewBee;

import java.util.concurrent.ThreadLocalRandom;

public class MathOeration {
    public static void main (String [] args) {
        //System.out.println (result(1,2,3,4));
        //System.out.println (bool(1,2));

        /*System.out.println (PolOrNot(8));
        System.out.println (PolOrNot(0));
        System.out.println (PolOrNot(-6));*/

        //System.out.println (bool2(ThreadLocalRandom.current().nextInt()));
        //System.out.println (Name("Лена"));
        System.out.println (God(ThreadLocalRandom.current().nextInt(2022)));


    }
    //3. вычисление результата по формуле a*(b+(c/d))
    /*public static double result(double a, double b, double c, double d) {
        return a * (b +c / d);
    }*/

    //4. проверка суммы переменных и возврат результата проверки булево
    /*public static boolean bool(int a, int b) {
        return (a+b >= 10 && a+b <= 20);
    }*/

    //5. положительное число передали или отрицательное
    /*public static String PolOrNot(int n) {
        return n >= 0 ? "Число положительное" : "Чиcло отрицательное";
    }*/

    //6. в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное
    /*public static boolean bool2(int a) {
        return a<0;
    }*/

    //7. в качестве параметра передается строка, обозначающая имя
   /* public static String Name (String name) {
        return "Привет, " + name;
    }*/

    //8. определяет, является ли год високосным
    public static String God(int g) {
        return g % 4 != 0 || g % 100 ==0 && g % 400 != 0 ? "Год не високосный " + g : "Год високосный " + g;
    }
}

       /* //2. объявление переменных
        int i = 45;
        long l = 2000L;
        byte b = 1;
        short s = 3;
        float f = 2.3f;
        double d = 56.3;
        boolean bool = false;
        char c = 'C';

        //3. вычисление результата по формуле a*(b+(c/d))
        double rez;
        rez = i*(l + (d/s));


        System.out.println (rez);*/

       /* //4. проверка суммы переменных и возврат результата проверки булево
        int a = 5, b = 30;
        boolean  c;
        if (a+b >= 10 && a+b <= 20) {
            c = true;
        } else {
            c = false;
        }
        System.out.println(c);*/

       /* //5. положительное число передали или отрицательное
        int a = ThreadLocalRandom.current().nextInt();
        if (a < 0) {
            System.out.println("Число отрицательное " + a);
        } else {
            System.out.println("Число положительное " + a);
        }*/

       /* //6. в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное
        int a = ThreadLocalRandom.current().nextInt();
        boolean b;
        if (a < 0) {
            b = true;
        } else {
            b = false;
        }
        System.out.println(b);
        System.out.println(a);*/

       /* //7. в качестве параметра передается строка, обозначающая имя
        String a = "Лена";

        System.out.println("Привет, " + a);*/

       /* //8. определяет, является ли год високосным
        int a = ThreadLocalRandom.current().nextInt(2022);
        int b = a % 4;
        int c = a % 100;
        int d = a % 400;


        if (b != 0 || d != 0 && c == 0) {
            System.out.println("Год не високосный " + a);
        } else {
            System.out.println("Год високосный " + a);
        }
        //System.out.println(b);
    }*/

//}
