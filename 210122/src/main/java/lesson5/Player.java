package lesson5;

public class Player {
    //задаём свойства класса
    String nickname;
    int point;
    int level;
    int many;

    public Player(String nickname, int point, int level, int many) { //вызвать Constructor -> лев. Alt + Insert выбрать нужные св-ва
        this.nickname = nickname;
        this.point = point;
        this.level = level;
        this.many = many;
    }

    public Player(String nickname) {  // урезанная версия конструктора для варианта когда при согдании объекта, свойства неизвестны и заданы по-умолчанию
        this(nickname, 0, 0, 10); //обращение у полному конструктору через this()
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
