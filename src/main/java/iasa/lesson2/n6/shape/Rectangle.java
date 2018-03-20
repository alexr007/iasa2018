package iasa.lesson2.n6.shape;

import iasa.lesson2.n6.xml.ElementNested;
import iasa.lesson2.n6.xml.ElementSimple;
import iasa.lesson2.n6.xml.XmlElement;

public final class Rectangle extends AbstractShape {
    private final int x;
    private final int y;
    private final int side_a;
    private final int side_b;

    public Rectangle(int x, int y, int side_a, int side_b) {
        this.x = x;
        this.y = y;
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public XmlElement element() {
        return new XmlElement(name(),
            new ElementNested(
                new XmlElement("x", new ElementSimple(x)),
                new XmlElement("y", new ElementSimple(y)),
                new XmlElement("side_a", new ElementSimple(side_a)),
                new XmlElement("side_b", new ElementSimple(side_b))
            )
        );
    }
}
