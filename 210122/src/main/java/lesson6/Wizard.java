package lesson6;

public class Wizard extends Player {


    public Wizard(String nickname, String rusName, int points) {
        super(nickname, rusName, points);
    }

    public void action() {
        System.out.println(getNickname() + " кастует заклинания");
    }

   /* public Wizard() {
        super ("Мэрлин", "Маг", 300);
    }*/

}
