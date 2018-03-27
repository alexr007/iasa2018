package iasa.lesson4;

public class AClass1 extends AClass0 implements Behavior {

    @Override
    public void doIt() {
        System.out.printf("Class 1:string length:%d\n", value);
    }
}
