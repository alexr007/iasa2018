package iasa.lesson2.n6.json;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class JsonObject implements JsonSerialized {
    private final List<JsonSerialized> items;

    public JsonObject(JsonSerialized... items) {
        this(Arrays.asList(items));
    }

    public JsonObject(List<JsonSerialized> items) {
        this.items = items;
    }

    @Override
    public CharSequence json() {
        final String DELIM = ",\n";
        final String TEMPLATE = "{\n%s}\n";
        return String.format(TEMPLATE,
                items.stream()
                .map(item ->item.json())
                .collect(Collectors.joining(DELIM))
        );
    }
}
