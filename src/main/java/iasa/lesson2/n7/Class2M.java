package iasa.lesson2.n7;

public class Class2M implements M {
    Class2 c2 = new Class2();

    @Override
    public int m1(int i, int j, int k) {
        return c2.m11(i,j,k);
    }

    @Override
    public int m2(int i, int j, int k) {
        return c2.m22(i,j,k);
    }
}
