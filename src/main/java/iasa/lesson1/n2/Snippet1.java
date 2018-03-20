package iasa.lesson1.n2;

public class Snippet1 {

    public static void main(String[] args) {
        int age=10;
        int year=1980;
        String name="abc";
        String place="office";
        int ready11 = calculate1(age, name, place);
        int ready12 = calculate2(age, name);

        Person1 sc = new Person1();
        sc.age=16;
        sc.name="Alla";

        int ready2 = calculate3(sc);
    }

    private static int calculate1(int age, String name, String place) {
        return 0;
    }

    private static int calculate2(int age, String name) {
        return 0;
    }

    private static int calculate3(Person1 sc) {
        int i=sc.age;
        int y=sc.year;
        String s=sc.name;
        return 0;
    }

}
