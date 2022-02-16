package lesson5;

public class Worker {

    String fullName;
    String position;
    String email;
    String phone;
    int pay;
    int age;


    public Worker(String fullName, String position, String email, String phone, int pay, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    @Override
    public String toString() {
       /* return "Worker{" +
                "ФИО = '" + fullName + '\'' +
                ", Должность = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", Номер телефона = '" + phone + '\'' +
                ", ЗП = " + pay +
                ", Возраст = " + age +
                '}';*/
        return String.format("Сотрудник %s работающий на должности %s с зарплатой в %d в возрасте %d к которому вы можете обратиться по Email %s или по телефону %s", fullName, position, pay, age, email, phone);
    }

    public void printSelection () {
        System.out.println(this);
    }
}
