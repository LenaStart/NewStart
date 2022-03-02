package lesson6;

import java.util.Objects;

public abstract class Player {

    private String nickname;
    private String rusProfTitle;
    private int points;

    /*public Player() {
    }*/

    public Player(String nickname, int points, String rusName) {
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

    /*@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/

    @Override
    public boolean equals(Object o) { //Alt+Ins сравнение не ссылок на string объекты, а их содержимого
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        //return Objects.equals(nickname, player.nickname); //стандартная реализация
        return nickname.equals((player.nickname)); //или так
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}
