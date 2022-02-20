package lesson6;

public class Cat extends Animal {

    private static int numberOfCat = 0;


    public Cat(String name, int run, int swim) {
        super(name, run, swim);
        numberOfCat++;
    }

    @Override
    public int getRun() {
        if (super.getRun() > 200) {
            System.out.println("Не верно. Кот не может пробежать больше 200 метров!");
        } else {
            this.setRun(super.getRun());
        }
            return this.getRun();

        //return super.getRun();
    }

    public static int getNumberOfCat() {
        return numberOfCat;
    }

    public static void setNumberOfCat(int numberOfCat) {
        Cat.numberOfCat = numberOfCat;
    }
}
