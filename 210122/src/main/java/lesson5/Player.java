package lesson5;

import java.util.Locale;

public class Player {
    //задаём свойства класса

    private static int playersCount = 0;

    private String nickname;
    private int level;
    private int point;
    private int money;

    public Player(String nickname,int level, int point, int many) { //вызвать Constructor -> лев. Alt + Insert выбрать нужные св-ва
        this.nickname = nickname.toUpperCase(); //сделать большими буквами
        this.level = level;
        this.point = point;
        this.money = Math.abs(many);  //полжительное, больше 0

        playersCount++;
    }

    public Player(String nickname) {  // урезанная версия конструктора для варианта когда при согдании объекта, свойства неизвестны и заданы по-умолчанию
        this(nickname, 1, 0, 100); //обращение у полному конструктору через this()
    }

    @Override // вызвать toString -> лев. Alt + Insert
    public String toString() {
        //return "Player{" + "Ник = '" + nickname + '\'' + ", очки = " + point + ", уровень = " + level + ", деньги = " + many + '}';
        return String.format ("У игрока %s (%d уровня), %d очков и %d монет", nickname, level, point, money);
    }

    public static int getPlayersCount() {
        return playersCount;
    }

    public static void setPlayersCount(int playersCount) {
        Player.playersCount = playersCount;
    }

    public String getNickname() {  //get метод для получения/записи/перезаписи информации
        return nickname;
    }
    //убрать метод set чтобы свойство оставалось неизменным
    /*public void setNickname(String nickname) { // set для получения информации
        this.nickname = nickname;
    }*/

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getMany() {
        return money;
    }

    public void setMany(int money) {
        if (money < 0 || money > Short.MAX_VALUE) {
            System.out.println("ОШИБКА! Неверное количество монет " + money);
        } else {
            this.money = money;
        }
    }

    public void printInfo() {
        System.out.println(this/*.toString()*/); //toStrting подразумевается
    }
}
