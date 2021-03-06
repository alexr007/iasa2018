package iasa.lesson2.n5.process.sp;

/**
 * Created by alexr on 09.02.2017.
 */
public class SpReplaceComma implements StringProcess {
    private final String origin;
    private final String FIND = ",";
    private final String REPLACE = ".";

    public SpReplaceComma(StringProcess origin) {
        this(origin.data());
    }

    public SpReplaceComma(String origin) {
        this.origin = origin;
    }

    @Override
    public String data() {
        return origin.replace(FIND, REPLACE);
    }
}
