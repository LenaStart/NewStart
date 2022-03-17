package lesson8;

public class Cat implements Actions{

    private final String name;
    private final int maxjumpHeight;
    private final int maxRunLength;

    public Cat(String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.maxjumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    public int run() {
        System.out.println("Кот " + this.name + " пробежал " + this.maxRunLength + " метров");
        return this.maxRunLength;
    }

    public int jump() {
        System.out.println("Кот " + this.name + " прыгнул на " + this.maxjumpHeight + " метра");
        return this.maxjumpHeight;
    }

    public String toString() {
        return name;
    }


}
