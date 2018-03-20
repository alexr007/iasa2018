package iasa.lesson2.n6.shape;

import iasa.lesson2.n6.json.JsonSerialized;
import iasa.lesson2.n6.xml.ElementNested;
import iasa.lesson2.n6.xml.ElementSimple;
import iasa.lesson2.n6.xml.XmlElement;

public final class Point extends AbstractShape implements JsonSerialized {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public XmlElement element() {
        return new XmlElement(name(),
            new ElementNested(
                new XmlElement("x", new ElementSimple(x)),
                new XmlElement("y", new ElementSimple(y))
            )
        );
    }

    @Override
    public CharSequence json() {
        return null;
    }
}
