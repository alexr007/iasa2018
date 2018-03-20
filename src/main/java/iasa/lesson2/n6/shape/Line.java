package iasa.lesson2.n6.shape;

import iasa.lesson2.n6.json.JsonInteger;
import iasa.lesson2.n6.json.JsonItem;
import iasa.lesson2.n6.json.JsonObject;
import iasa.lesson2.n6.json.JsonSerialized;
import iasa.lesson2.n6.xml.ElementNested;
import iasa.lesson2.n6.xml.ElementSimple;
import iasa.lesson2.n6.xml.XmlElement;

public final class Line extends AbstractShape implements JsonSerialized {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    Point p1;
    Point p2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public XmlElement element() {
        return new XmlElement(name(),
                new ElementNested(
                        new XmlElement("x1", new ElementSimple(x1)),
                        new XmlElement("y1", new ElementSimple(y1)),
                        new XmlElement("x2", new ElementSimple(x2)),
                        new XmlElement("y2", new ElementSimple(y2))
                )
        );
    }

    @Override
    public CharSequence json() {
        return
                new JsonItem(
                        name(),
                        new JsonObject(
                                new JsonItem("x1", new JsonInteger(x1)),
                                new JsonItem("y1", new JsonInteger(y1)),
                                new JsonItem("x2", new JsonInteger(x2)),
                                new JsonItem("y2", new JsonInteger(y2))
                        )
                ).json();
    }

    public CharSequence json2() {
        return
                new JsonItem(
                        name(),
                        new JsonObject(
                                new Point3D(1,2,3),
                                new Point3D(1,2,3)
                        )
                ).json();
    }
}
