package iasa.lesson2.n7;

public class Main {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        c1.m1(1,1,1);
        c2.m22(1,1,2);

        M c1m = new Class1M();
        M c2m = new Class2M();

        c1m.m1(1,1,1);
        c2m.m1(1,1,1);

    }
}
