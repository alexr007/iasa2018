package iasa.lesson6.observer.interf;

import iasa.lesson6.observer.entity.Document;
import java.util.ArrayList;
import java.util.List;

public class AbstractSubscriber implements Printable<Document>{
    protected final List<Document> items = new ArrayList<>();
    private final String name;

    public AbstractSubscriber(String name) {
        this.name = name;
    }

    @Override
    public List<Document> getItems() {
        return items;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append("\n");
        for (Document d : this.getItems()) {
            sb.append(d.toString()).append("\n");
        }
        return sb.toString();
    }
}