
package lesson8;

import lesson8.Obstruction.*;
/*import lesson8.Obstruction.Treadmill;
import lesson8.Obstruction.Wall;*/
import lesson8.Actions.*;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        Actions human = new Human("Иван", 3, 9);
        Actions cat = new Cat("Герой", 2, 3);
        Actions robot = new Robot("RK800", 1, 12);

        Obstruction treadmill1 = new Treadmill(1);
        Obstruction treadmill2 = new Treadmill(3);
        Obstruction treadmill3 = new Treadmill(9);
        Obstruction treadmill4 = new Treadmill(12);

        Obstruction wall1 = new Wall(1);
        Obstruction wall2 = new Wall(2);
        Obstruction wall3 = new Wall(3);
        Obstruction wall4 = new Wall(6);

        Actions [] actions = {human,cat,robot};
        Obstruction[] obstacles = {treadmill1,wall1,treadmill2,wall2,treadmill3,wall3,treadmill4,wall4};

        for (int i = 0; i < actions.length; i++) {
            boolean can;
            for (int j = 0; j < obstacles.length; j++) {
                can = obstacles[j].participantCan(actions[i]);
                if (!can) {
                    System.out.println("Участник " + actions[i]+ " выбыл");
                    break;
                }
            }
        }
    }
}


