package iasa.lesson2.n6.shape;

import iasa.lesson2.n6.xml.XmlElement;

public abstract class AbstractShape implements XmlSerialized {
    public CharSequence name() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    @Override
    public CharSequence xml() {
        return element().xml();
    }

    public abstract XmlElement element();
}
