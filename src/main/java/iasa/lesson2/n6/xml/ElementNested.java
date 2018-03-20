package iasa.lesson2.n6.xml;

import iasa.lesson2.n6.shape.XmlSerialized;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class ElementNested implements XmlSerialized {
    private final List<XmlSerialized> elements;

    public ElementNested(XmlSerialized... elements) {
        this(Arrays.asList(elements));
    }

    public ElementNested(List<XmlSerialized> elements) {
        this.elements = elements;
    }

    @Override
    public CharSequence xml() {
        return elements.stream()
                .map(xmlElement -> xmlElement.xml())
                .collect(Collectors.joining());
    }
}
