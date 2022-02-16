package lesson5;

import java.util.Locale;

public class Player {
    //задаём свойства класса
    String nickname;
    int level;
    int point;
    int many;

    public Player(String nickname,int level, int point, int many) { //вызвать Constructor -> лев. Alt + Insert выбрать нужные св-ва
        this.nickname = nickname.toUpperCase(); //сделать большими буквами
        this.level = level;
        this.point = point;
        this.many = Math.abs(many);  //полжительное, больше 0
    }

    public Player(String nickname) {  // урезанная версия конструктора для варианта когда при согдании объекта, свойства неизвестны и заданы по-умолчанию
        this(nickname, 1, 0, 100); //обращение у полному конструктору через this()
    }

    @Override // вызвать toString -> лев. Alt + Insert
    public String toString() {
        //return "Player{" + "Ник = '" + nickname + '\'' + ", очки = " + point + ", уровень = " + level + ", деньги = " + many + '}';
        return String.format ("У игрока %s (%d уровня), %d очков и %d монет", nickname, level, point, many);
    }

    public void printInfo() {
        System.out.println(this/*.toString()*/); //toStrting подразумевается
    }
}
