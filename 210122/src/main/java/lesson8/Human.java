package lesson8;

public class Human implements Actions{

    private final String name;
    private final int maxjumpHeight;
    private final int maxRunLength;

    public Human(String name, int maxjumpHeight, int maxRunLength) {
        this.name = name;
        this.maxjumpHeight = maxjumpHeight;
        this.maxRunLength = maxRunLength;
    }

    public int run() {
        //System.out.println("Участник " + this.name + " пробежал дорожку");// + this.maxRunLength + " метров");
        return this.maxRunLength;
    }

    public int jump() {
        //System.out.println("Участник " + this.name + " перепрыгну стену");// + this.maxjumpHeight + " метра");
        return this.maxjumpHeight;
    }

    public String toString() {
        return name;
    }

}
