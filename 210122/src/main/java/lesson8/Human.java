package lesson8;

public class Human implements Community {
    private int run;
    private int jump;

    public Human(int run, int jump) {
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
        return "Human{" +
                "run=" + run +
                ", jump=" + jump +
                '}';
    }
}
