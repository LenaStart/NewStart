package lesson8;

public class Wall implements Obstruction {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean participantCan(Actions actions) {
        if (actions.jump() >= this.height) {
            System.out.println("Участник " + actions + " перепрыгнул препятствие " + this.height + " метра");
            return true;
        } else {
            System.out.println("Участник " + actions + " споткнулся на отметке " + this.height + " метра");
            return false;
        }
    }
}
