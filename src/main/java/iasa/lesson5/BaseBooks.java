package iasa.lesson5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseBooks implements Books {
    List<Book> items = new ArrayList<>();

    @Override
    public List<Book> get() {
        return items;
    }

    @Override
    public Iterator<Book> iterator() {
        return items.iterator();
    }

/*
    public Books read(String s) {
        db.connect();
        List<Entity> db_list = db.select(s);
        Books books = new Mapper(db_list);
        return books;
    }
*/
}
