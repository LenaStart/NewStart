package lesson6;

public class Animal { //указали что класс абстрактный, используется только как родитель, для наследования и не может сожержать собственные экземпляры

    private static int numberOfAnimals = 0;

    private String name;
    private int run;
    private int swim;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        numberOfAnimals++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;

    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public static void setNumberOfAnimals(int numberOfAnimals) {
        Animal.numberOfAnimals = numberOfAnimals;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("%s пробежал %d метров и проплыл %d метров",name,run,swim);
    }

    //public abstract void action();
}
