package iasa.lesson2.n6.xml;

import iasa.lesson2.n6.shape.XmlSerialized;

public final class ElementSimple implements XmlSerialized {
    private final CharSequence value;

    public ElementSimple(int value) {
        this(Integer.toString(value));
    }

    public ElementSimple(CharSequence value) {
        this.value = value;
    }

    @Override
    public CharSequence xml() {
        return value;
    }
}
