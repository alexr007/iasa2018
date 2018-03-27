package iasa.lesson4;

public class ClassBuilder {
    public static Behavior build(String s) {
        if (s == "ABC") {
            AClass1 aClass1 = new AClass1();
            aClass1.setValue(s.length());
            return aClass1;
        } else {
            AClass2 aClass2 = new AClass2();
            aClass2.setValue(s.length());
            return aClass2;
        }
    }
}
