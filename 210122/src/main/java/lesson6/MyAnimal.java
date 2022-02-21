package lesson6;

public class MyAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 105, 0);
        Cat cat2 = new Cat("Агат", 290, 16);
        Cat cat3 = new Cat("Пушок", 199, 1);
        Cat cat4 = new Cat("Лис", 157, 20);

        Dog dog1 = new Dog("Рекс", 600, 10);
        Dog dog2 = new Dog("Дружок", 412, 203);
        Dog dog3 = new Dog("Зверь", 1063, 20);

        //cat1.setRun(200);

        Animal[] animals = {cat1,cat2,cat3,cat4};
        for (Animal animal: animals) {
            if (animal.getRun() > 200) {
                System.out.println("Немыслимо! Кот " + animal.getName() + " не мог пробежать " + animal.getRun() +  " метров!");
                animal.setRun(200);
            } else {
                animal.setRun(animal.getRun());
            }
            if (animal.getSwim() > 0) {
                System.out.println("Кот " + animal.getName() + " не плавает!");
                animal.setSwim(0);
            } else {
                animal.setSwim(animal.getSwim());
            }
            animal.printInfo();
        }

       /* cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();
        cat4.printInfo();*/
        System.out.println("_______________________________________________");

        Animal[] animals1 = {dog1,dog2,dog3};
        for (Animal animal: animals1) {
            if (animal.getRun() > 500) {
                System.out.println("ОШИБКА! Собака " + animal.getName() + " не может пробежать " + animal.getRun() +  " метров!");
                animal.setRun(500);
            } else {
                animal.setRun(animal.getRun());
            }
            if (animal.getSwim() > 10) {
                System.out.println("Собака " + animal.getName() + " не может проплыть больше 10 метров!");
                animal.setSwim(10);
            } else {
                animal.setSwim(animal.getSwim());
            }
            animal.printInfo();
        }

        /*dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();*/
        System.out.println("_______________________________________________");

        System.out.printf("В забеге учавствовало: %d животных.\nИз них %d кошек и %d собаки.\n",Animal.getNumberOfAnimals(), Cat.getNumberOfCat(),Dog.getNumberOfDog());
        System.out.println("_______________________________________________");
    }
}
