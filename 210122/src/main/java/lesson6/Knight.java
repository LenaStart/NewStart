package lesson6;

public class Knight extends Player { //наследование свойств и методов из класса Player

    private String weapon;

    public Knight(String nickname, int points, String weapon) {
        super(nickname, points, "Рыцарь"); //наследование из класса родителя ВСЕГДА должно быть первой строкой
        this.weapon = weapon;
    }

    public Knight(String nickname, int points) {
        this(nickname, points,"Стилет"); //дефолтное значение 4 аргумента, если не задано при инициализации
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" и завладел оружием класса %s ", weapon); //переопределили метод toString чтобы добавить weapon
    }

    @Override
    public void action() {
        System.out.println(getNickname() + " использует оружие класса "+ weapon);
    }

    /*public Knight() {
        super("Артур", "Рыцарь", 101); //обращение к родительскому классу Player
    }*/
}
