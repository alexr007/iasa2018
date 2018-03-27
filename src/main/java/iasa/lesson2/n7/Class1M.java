package iasa.lesson2.n7;

public class Class1M implements M {
    Class1 c1 = new Class1();

    @Override
    public int m1(int i, int j, int k) {
        return c1.m1(i,j,k);
    }

    @Override
    public int m2(int i, int j, int k) {
        return c1.m2(i,j,k);
    }
}
