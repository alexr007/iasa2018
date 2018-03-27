package iasa.lesson2.n2;

public class Usage<IN, OUT> {
    private final ConvertGen<IN, OUT> convert;

    public Usage(ConvertGen<IN, OUT> convert) {
        this.convert = convert;
    }

    OUT process(IN src) {
        return convert.apply(src);
    }
}
