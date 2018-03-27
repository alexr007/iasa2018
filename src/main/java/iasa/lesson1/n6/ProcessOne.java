package iasa.lesson1.n6;

public class ProcessOne implements Process {
    @Override
    public String process(String src) {
        return src.toUpperCase();
    }
}
