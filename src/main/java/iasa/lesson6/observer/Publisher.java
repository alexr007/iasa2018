package iasa.lesson6.observer;

import iasa.lesson6.observer.entity.Document;
import iasa.lesson6.observer.interf.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void publishMagazine() {
        // create new Event
        Document ent = new Document();
        // publish this Event to all subscribers
        for (Subscriber s : subscribers) {
            s.add(ent);
        }
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        int index = subscribers.indexOf(subscriber);
        if (index >= 0) {
            subscribers.remove(index);
        }
    }
}