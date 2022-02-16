package lesson5;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Bender", 88, 15000, 2567);
        Player player2 = new Player("AssKicker");
        Player player3 = new Player("Pointer", 120, 999999, 88888);

        /*player1.nickname = "Bender";
        player2.nickname = "AssKicker";*/

        /*player1.level = 10;
        player2.level = 80;

        player1.many = 1220;
        player2.many = 1800;

        player1.point = 1200000;
        player2.point = 2000000;*/


        //System.out.println("Игрок 1: " + player1.nickname + " " + player1.level + " уровня");
        //System.out.println("Игрок 2: " + player2.nickname + " " + player2.level + " уровня");

        //System.out.println(player1);
        //System.out.println(player2);

        player1.printInfo();
        player2.printInfo();
        player3.printInfo();

    }

}
