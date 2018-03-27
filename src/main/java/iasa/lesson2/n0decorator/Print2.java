package iasa.lesson2.n0decorator;

public class Print2 implements Print {
    private final Print prnt;

    public Print2(Print pr) {
        this.prnt = pr;
    }

    @Override
    public void printMe() {
        System.out.println("1");
        prnt.printMe();
        System.out.println("2");
    }
}
