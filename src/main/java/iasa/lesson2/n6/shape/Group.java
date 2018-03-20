package iasa.lesson2.n6.shape;

import iasa.lesson2.n6.xml.ElementNested;
import iasa.lesson2.n6.xml.XmlElement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class Group extends AbstractShape {
    private final List<AbstractShape> shapes;

    public Group(AbstractShape... shapes) {
        this(Arrays.asList(shapes));
    }

    public Group(List<AbstractShape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public XmlElement element() {
        return new XmlElement(name(),
                new ElementNested(
                        shapes.stream()
                                .map(shape -> shape.element())
                                .collect(Collectors.toList())
                )
        );
    }

}

