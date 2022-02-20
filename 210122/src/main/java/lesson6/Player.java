package lesson6;

public abstract class Player {

    private String nickname;
    private String rusProfTitle;
    private int points;

    /*public Player() {
    }*/

    public Player(String nickname, String rusName, int points) {
        this.nickname = nickname;
        this.rusProfTitle = rusName;
        this.points = points;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRusName() {
        return rusProfTitle;
    }

    public void setRusName(String rusName) {
        this.rusProfTitle = rusName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("%s получил профессию %s и %d очков опыта",nickname,rusProfTitle,points);
    }

    public abstract void action();

}
