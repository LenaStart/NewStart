package lesson8;

public class Treadmill implements Obstruction {

    private  int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean participantCan(Actions actions) {
        if (actions.run() > this.lenght) {
            System.out.println("Участник " + actions + " пробежал дистанцию");
            return true;
        } else {
            System.out.println("Участник " + actions + " споткнулся");
            return false;
        }
    }
}
