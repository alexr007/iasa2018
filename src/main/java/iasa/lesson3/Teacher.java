package iasa.lesson3;

import java.util.List;

public class Teacher extends Person {
    private List<Subject> subjects;

    public Teacher(String name, Date birth) {
        super(name, birth);
    }

}
