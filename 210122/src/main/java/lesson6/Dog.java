package lesson6;

public class Dog extends Animal{

    private static int numberOfDog = 0;

    public Dog(String name, int run, int swim) {
        super(name, run, swim);
        numberOfDog++;
    }

    public static int getNumberOfDog() {
        return numberOfDog;
    }

    public static void setNumberOfDog(int numberOfDog) {
        Dog.numberOfDog = numberOfDog;
    }
}
