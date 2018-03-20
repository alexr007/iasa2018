package iasa.lesson2.n6.json;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class JsonArray implements JsonSerialized {
    private final List<JsonSerialized> items;

    public JsonArray(JsonSerialized... items) {
        this(Arrays.asList(items));
    }

    public JsonArray(List<JsonSerialized> items) {
        this.items = items;
    }

    @Override
    public CharSequence json() {
        final String DELIM = ", ";
        final String TEMPLATE = "[%s]";
        return String.format(TEMPLATE,
                items.stream()
                        .map(item ->item.json())
                        .collect(Collectors.joining(DELIM))
        );
    }
}
