package lesson6;

public class Main {
    public static void main(String[] args) {

        Knight knight1 = new Knight("Артур", "Рыцарь", 101, "Меч");
        Knight knight2 = new Knight("Ланселот", "Рыцарь", 1001, "Алебарда");
        Knight knight3 = new Knight("Тристан", "Рыцарь", 265);

        Wizard wizard = new Wizard("Мэрлин", "Маг", 300);


        //System.out.println(knight.toString()); toString указывать не обязателбно
        /*System.out.println(knight);
        System.out.println(wizard);*/

        knight1.printInfo();
        knight2.printInfo();
        knight3.printInfo();
        wizard.printInfo();

        knight1.action();
        knight2.action();
        knight3.action();
        wizard.action();

    }
}
