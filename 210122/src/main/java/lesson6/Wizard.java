package lesson6;

public class Wizard extends Player {


    public Wizard(String nickname, int points) {
        super(nickname, points, "Маг");
    }

    public void action() {
        System.out.println(getNickname() + " кастует заклинания");
    }

   /* public Wizard() {
        super ("Мэрлин", "Маг", 300);
    }*/

}
