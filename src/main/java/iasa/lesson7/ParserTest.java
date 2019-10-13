package iasa.lesson7;

import java.util.ArrayList;
import java.util.List;

public class ParserTest implements Parser {
    @Override
    public List<String> path() {
        List<String> al = new ArrayList<>();
        al.add("user");
        al.add("list");
        return al;
    }
}
