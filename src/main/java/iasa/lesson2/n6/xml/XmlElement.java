package iasa.lesson2.n6.xml;

import iasa.lesson2.n6.shape.XmlSerialized;

public final class XmlElement implements XmlSerialized {
    private final CharSequence name;
    private final XmlSerialized value;

    public XmlElement(CharSequence name, XmlSerialized value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public CharSequence xml() {
        final String template="<%s>%s</%s>";
        return String.format(template, name, value.xml(), name);
    }
}
