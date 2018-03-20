package iasa.lesson1.n9;

public class Snippet9 {
    public static void main(String[] args) {
        int i = 1;
        Integer j = new Integer(1);
        double d = 2.0d;

        Double d1 = new Double(1.0d);
        Double d2 = new Double(1.0d);

        System.out.println(d1==d2); // false
        System.out.println(d1.equals(d2)); // true
    }
}
