package iasa.lesson5;

import java.util.List;

public interface Books extends Iterable<Book> {
    List<Book> get();
}
