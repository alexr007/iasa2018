package iasa.lesson2.n2;

public class Usage<IN, OUT> {
    private final ConvetGen<IN, OUT> convert;

    public Usage(ConvetGen<IN, OUT> convert) {
        this.convert = convert;
    }

    OUT process(IN src) {
        return convert.apply(src);
    }
}
