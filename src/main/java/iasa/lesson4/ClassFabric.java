package iasa.lesson4;

public class ClassFabric {
    public static Behavior build(String s) {
        return s == "ABC" ? new AClass1() : new AClass2();
    }
}
