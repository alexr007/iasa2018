package iasa.lesson2.n0decorator;

public class Main {

    public static void useIt(Print item) {
        item.printMe();
    }

    public static void main(String[] args) {
        useIt(new Print1());
        useIt(new Print2(new Print1()));
    }


}
