package iasa.lesson2.n3;

public class Single {
    private static Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
