package iasa.lesson6.observer;

import iasa.lesson6.observer.entity.Document;
import iasa.lesson6.observer.interf.AbstractSubscriber;
import iasa.lesson6.observer.interf.Subscriber;

public class SubscriberType2 extends AbstractSubscriber implements Subscriber {

    public SubscriberType2(String name) {
        super(name);
    }

    @Override
    public void add(Document d) {
        this.items.add(d);
    }
}
