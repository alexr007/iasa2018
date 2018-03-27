package iasa.lesson6.observer.interf;

import iasa.lesson6.observer.entity.Document;

public interface Subscriber {
    void add(Document d);
}