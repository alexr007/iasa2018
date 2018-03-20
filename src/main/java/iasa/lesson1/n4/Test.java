package iasa.lesson1.n4;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1990, "Alex");
        Student s2 = new Student(1991, "Petr");
        Student s3 = Student.build(1992, "Andy");
        Teacher t1 = new Teacher(1970, "Victor");
        Teacher t2 = new Teacher(1972, "Masha");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.value());
        t1.printMe();
        t2.printMe();

        Cat cat = new Cat();
        ArrayList<Doable> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(t1);
        l.add(t2);
        l.add(cat);
        // design 1
        l.forEach(d -> d.doIt());
        // design 2
        l.forEach(Doable::doIt);
        // design 3
        l.forEach(new ConsumerDoable());
        // design4
        l.forEach(new Consumer<Doable>() {
            @Override
            public void accept(Doable d) {
                d.doIt();
            }
        });
        //@BAD DESIGN !!!
        l.forEach(new Consumer<Doable>() {
            @Override
            public void accept(Doable doable) {
                doable.doIt();
                if(doable instanceof Cat) {
                    ((Cat) doable).meo();
                }
            }
        });
        // static examples
        Doable doable1 = staticSample1();
        Doable doable2 = staticSample2();
        Doable doable3 = staticSample3();
        Cat doable4 = staticSample3();
    }

    static Doable staticSample1() {
        return new Student(10, "Vanya");
    }

    static Doable staticSample2() {
        return new Cat();
    }

    static Cat staticSample3() {
        return new Cat();
    }

}
