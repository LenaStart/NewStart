package lesson7;

public class CatEat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Марсик", 5);
        Cat cat2 = new Cat("Барон", 15);
        Cat cat3 = new Cat("Пират", 6);
        Plate plate = new Plate(10);
        plate.setAddCutlets(2); //досыпать котлет


        Cat[] cats = {cat1, cat2, cat3};
        for (Cat cat : cats) {
            plate.info();
            if (plate.getFood() >= cat.appetite && cat.appetite != 0) {
                cat.eat(plate);
                System.out.println("Кот " + cat.name + " съел " + cat.appetite + " котлет");
                plate.info();
                cat.appetite = 0;
                cat.setFulness(true);
                System.out.println("Кот " + cat.name + " наелся и спит =) " +  cat.isFulness());
                //System.out.println("Кот насытился " );
            } else if (cat.appetite != 0) {
                cat.setFulness(false);
                System.out.println("Кот " + cat.name + " всё ещё голоден =( " + cat.isFulness());

                //System.out.println(cat.isFulness());
            }
        }
    }

}
