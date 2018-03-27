package iasa.lesson2.n2;

public interface ConvertGen<IN, OUT> {
    OUT apply(IN origin);
}
