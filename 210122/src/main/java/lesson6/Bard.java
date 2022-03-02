package lesson6;

public class Bard extends Player {

    public Bard(String nickname,int points) {
        super(nickname,points,"Бард");
    }
    private String sing;

    @Override
    public void action() {
        System.out.println(getNickname() + " настраивает лютню");
    }
    public void sing() {
        System.out.println("Ведьмаку заплатите чеканной манетой, чеканной манетой, уооооу");
    }

}
