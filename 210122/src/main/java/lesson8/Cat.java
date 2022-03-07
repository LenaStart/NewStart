package lesson8;

public class Cat implements Community {
    private int run;
    private int jump;

    public Cat(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "run=" + run +
                ", jump=" + jump +
                '}';
    }
}
