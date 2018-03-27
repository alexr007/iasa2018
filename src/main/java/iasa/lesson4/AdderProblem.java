package iasa.lesson4;

public class AdderProblem {
    private final int val;

    public AdderProblem(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public AdderProblem add(int val) {
        return new AdderProblem(this.val+val);
    }

/*
    public void add(int val) {
        this.val+= val;
    }
*/

    @Override
    public String toString() {
        return String.format("Value: %d\n",this.val);
    }
}
