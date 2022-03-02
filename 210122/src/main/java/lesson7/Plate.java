package lesson7;

public class Plate {
    private int food;
    public int addCutlets;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void info() {
        System.out.println("В тарелке: " + food + " котлет");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getAddCutlets() {
        return addCutlets;
    }

    public void setAddCutlets (int addCutlets) {
        this.addCutlets = addCutlets + food;
        setFood(this.addCutlets);
    }
}
