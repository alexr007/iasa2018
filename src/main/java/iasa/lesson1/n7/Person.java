package iasa.lesson1.n7;

public class Person implements Comparable<Person>{
    private final int age;
    private final int rate;
    private final CharSequence name;

    public Person(int age, int rate, CharSequence name) {
        this.age = age;
        this.rate = rate;
        this.name = name;
    }

    public void printMe() {
        System.out.printf(
            "name: %-8s, age:%d, rate:%d\n", this.name, this.age, this.rate
        );
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }

    public int age() {
        return this.age;
    }

    public int rate() {
        return this.rate;
    }

    public CharSequence name() {
        return this.name;
    }
}
