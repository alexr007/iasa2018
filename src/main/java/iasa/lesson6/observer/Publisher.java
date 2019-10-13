package iasa.lesson6.observer;

import iasa.lesson6.observer.entity.Document;
import iasa.lesson6.observer.interf.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void publishDocument(int num) {
        // create new Document
        Document doc = new Document(num);
        // publish this Event to all subscribers
        for (Subscriber s : subscribers) {
            s.add(doc);
        }
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        if (subscribers.contains(s)) {
            subscribers.remove(s);
        }
/*
        int index = subscribers.indexOf(s);
        if (index >= 0) {
            subscribers.remove(index);
        }
*/
    }
}