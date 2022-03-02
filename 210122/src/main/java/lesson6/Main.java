package lesson6;

public class Main {
    public static void main(String[] args) {

        Knight knight1 = new Knight("Артур",  101, "Меч");
        Knight knight2 = new Knight("Ланселот",  1001, "Алебарда");
        Knight knight3 = new Knight("Тристан",  265);

        Wizard wizard = new Wizard("Мэрлин", 300);

        Bard bard = new Bard("Лютик",1420);


        //System.out.println(knight.toString()); toString указывать не обязателбно
        /*System.out.println(knight);
        System.out.println(wizard);*/
        
        Player[] players = {knight1,knight2,knight3,wizard,bard};
        for (Player player : players) {
            //player.sing(); //у обобщённого класса Player нет свойства sing
            if (player instanceof Bard) { //проверяем является ли player Бардом
                ((Bard) player).sing(); //есди да, то можем обратиться к св-су петь
            }
            /*if (player instanceof Bard trueBard) { //так бфло сделано на уроке, мне (выше) программа дала обратиться от player
                trueBard.sing();
            }*/
            player.printInfo();
            player.action();
            System.out.println("_______________\n");
        }

       /* knight1.printInfo();
        knight2.printInfo();
        knight3.printInfo();
        wizard.printInfo();

        knight1.action();
        knight2.action();
        knight3.action();
        wizard.action();*/

    }

}
