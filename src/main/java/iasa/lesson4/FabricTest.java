package iasa.lesson4;

public class FabricTest {
    public static void main1(String[] args) {
        String s = "ABC";
        if (s == "ABC") {
            AClass1 a1 = new AClass1();
            a1.doIt();
        } else {
            AClass2 a2 = new AClass2();
            a2.doIt();
        }
    }

    public static void main2(String[] args) {
        ClassFabric.build("ABC").doIt();
        ClassFabric.build("AB").doIt();
    }

    public static void main(String[] args) {
        ClassBuilder.build("ABC").doIt();
        ClassBuilder.build("AB").doIt();
    }
}
