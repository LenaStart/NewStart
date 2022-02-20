package lesson6;

public class MyAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 105, 0);
        Cat cat2 = new Cat("Агат", 90, 0);
        Cat cat3 = new Cat("Пушок", 211, 0);
        Cat cat4 = new Cat("Лис", 157, 0);

        Dog dog1 = new Dog("Рекс", 600, 12);
        Dog dog2 = new Dog("Дружок", 412, 12);
        Dog dog3 = new Dog("Зверь", 163, 12);

        cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();
        cat4.printInfo();
        System.out.println("_______________________________________________");

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        System.out.println("_______________________________________________");

        System.out.printf("В забеге учавствовало: %d животных.\nИз них %d кошек и %d собаки.\n",Animal.getNumberOfAnimals(), Cat.getNumberOfCat(),Dog.getNumberOfDog());
        System.out.println("_______________________________________________");
    }
}
