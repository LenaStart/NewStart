package lesson2;

import java.sql.SQLOutput;
import java.util.concurrent.ThreadLocalRandom;

public class TestMethods {
    public static void main (String [] args) {
        sumVarsAndPrint(3,5);
        sumVarsAndPrint(-1,-5);
        sumVarsAndPrint(0,4);
        printNumsAndResult(3, 4);
        testChecksAppraisel();
    }

    private static void testChecksAppraisel() {
        testAppraisalWithArg(5);
        testAppraisalWithArg(3);
        testAppraisalWithArg(4);
        testAppraisalWithArg(2);
        testAppraisalWithArg(1);
        testAppraisalWithArg(-1);
        testAppraisalWithArg(6);
    }

    private static void testAppraisalWithArg(int appraisal) {
        //int appraisal = ThreadLocalRandom.current().nextInt(8) - 2;
        System.out.println("Студент принес оценку: " + appraisal);
        if (appraisal == 5) {
            System.out.println("Молодец! Так держать!");
        } else if (appraisal == 4) {
            System.out.println("Хорошо, но ты можешь лучше");
        } else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Готовь уроки лучше!");
        } else {
            System.out.println("Не мухлюй! Говори правду!");
        }
        System.out.println("Проверка окончена");
    }

    private static void sumVarsAndPrint(int a, int b) {
        int result = a+b;
        System.out.println("Сумма чисел: " + result);
    }

    private static void printNumsAndResult(int a, int b) {
        int result = sumVarsAndReturn(a, b);
        //System.out.printf("%d + %d = %d%n", a, b, result);
        System.out.println(a + " + " + b + " = " + result);
    }

    private static int sumVarsAndReturn(int a, int b) {
        int result = a + b;
        return result;
    }
}
