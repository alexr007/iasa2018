package iasa.lesson2.n6.shape;

import iasa.lesson2.n6.json.JsonSerialized;
import iasa.lesson2.n6.xml.XmlElement;

public class Point3D extends AbstractShape implements JsonSerialized {
    private final int x;
    private final int y;
    private final int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public CharSequence json() {
        return null;
    }

    @Override
    public XmlElement element() {
        return null;
    }
}
