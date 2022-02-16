package lesson5;

public class selection {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Иванов Кузьма Ильич", "директор", "ivayov@mail.ru", "8-960-123-456-78", 100000, 45);
        Worker worker2 = new Worker("Петров Семён Олегович", "замдиректора", "petrov@mail.ru", "8-960-123-456-79", 90000, 40);
        Worker worker3 = new Worker("Кузнецова Ольга Вадимовна", "бухгалтер", "kuznecova@mail.ru", "8-960-123-456-77", 80000, 50);
        Worker worker4 = new Worker("Никитин Фёдор Иванович", "системный администратор", "nikitin@mail.ru", "8-960-123-456-76", 75000, 25);
        Worker worker5 = new Worker("Ульянова Зоя Макаровна", "уборщик", "ulyanova@mail.ru", "8-960-123-456-74", 30000, 18);
        Worker worker6 = new Worker("Григорьев Фома Акимович", "уборщик", "grigorev@mail.ru", "8-960-123-456-70", 35000, 78);

        /*worker1.printSelection();
        worker2.printSelection();
        worker3.printSelection();
        worker4.printSelection();
        worker5.printSelection();
        worker6.printSelection();*/


        Worker [] workers =  {worker1, worker2, worker3, worker4, worker5,worker6};
        for (Worker worker : workers) {
            if (worker.age >= 40) {
                worker.printSelection();
            }
        }
    }
}
