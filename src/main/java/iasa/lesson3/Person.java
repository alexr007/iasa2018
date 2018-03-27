package iasa.lesson3;

public class Person {
    final protected String name;
    final protected Date birth;

    public Person(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    @Override
    public boolean equals(Object obj) {
        Person p2 = (Person) obj;
        return this.name.equals(p2.name) &&
                this.birth.equals(p2.birth);
    }

    @Override
    public String toString() {
        return String.format("Name:%s, Birth date:%s", this.name, this.birth);
    }
}
