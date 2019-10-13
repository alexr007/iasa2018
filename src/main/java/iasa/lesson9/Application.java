package iasa.lesson9;

public class Application {

    Integer get2() {
        return null;
    }

    Integer get1() {
        return 0;
        //return Integer.Empty();
    }

    public void do2(Integer i) {
        if (i == null) {
            System.out.println("null");
        } else {
            System.out.println(i);
        }
    }

    public static void do1(Value v) {
/*
        if (v.hasValue()) {
            System.out.println(v.value());
        } else {
            System.out.println("null");
        }
*/
    }

    public static void main(String[] args) {
 /*       Value v1 = new Value.Empty();
        Value<Integer> v2 = new Value.Int(1);
        Value<String> v3 = new Value.Str("abc");

        System.out.println(v1.hasValue());
        System.out.println(v2.hasValue());
        System.out.println(v3.hasValue());

        do1(v1);
        do1(v2);
        do1(v3);

        Integer value1 = v2.value();
        String value2 = v3.value();

*/
    }
}
