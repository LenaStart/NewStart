package lesson7;

public class Cat {
    public String name;
    public int appetite;
    public boolean fulness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFulness() {
        return fulness;
    }

    public void setFulness(boolean fulness) {
        this.fulness = fulness;
    }
}


