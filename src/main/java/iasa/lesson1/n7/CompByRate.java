package iasa.lesson1.n7;

import java.util.Comparator;

public class CompByRate implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.rate()-o2.rate();
    }
}
