package lesson6;

public class Cat extends Animal {

    private static int numberOfCat = 0;


    public Cat(String name, int run, int swim) {
        super(name, run, swim);
        numberOfCat++;
    }

    @Override
    public void setRun(int run) {
        /*if (run > 200) {
            System.out.println("ОШИБКА! Кот не может пробежать больше 200 метров!");
            run = 0;
            super.setRun(run);
        }*/
        super.setRun(run);
    }

    public static int getNumberOfCat() {
        return numberOfCat;
    }

    public static void setNumberOfCat(int numberOfCat) {
        Cat.numberOfCat = numberOfCat;
    }
}
