package iasa.lesson6.observer.interf;

import java.util.List;

public interface Printable<T> {
    List<T> getItems();
    String getName();
}