package iasa.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Parser1 implements Parser{
    private final String origin;

    public Parser1(String origin) {
        this.origin = origin;
    }

    @Override
    public List<String> path() {
        ArrayList<String> al = new ArrayList<>();
        if (origin.contains("/user")) {
            al.add("user");
        }
        return al;
    }

}
