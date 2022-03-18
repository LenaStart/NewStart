package lesson8;

public class Robot implements Actions{

    private final String name;
    private final int maxjumpHeight;
    private final int maxRunLength;

    public Robot(String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.maxjumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    public int run() {
        //System.out.println("Робот " + this.name + " пробежал дорожку");// + this.maxRunLength + " метров");
        return this.maxRunLength;
    }

    public int jump() {
        //System.out.println("Робот " + this.name + " прыгнул стену");// на " + this.maxjumpHeight + " метра");
        return this.maxjumpHeight;
    }

    public String toString() {
        return name;
    }
}
