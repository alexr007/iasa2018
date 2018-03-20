package iasa.lesson2.n6.json;

public final class JsonItem implements JsonSerialized {
    private final CharSequence name;
    private final JsonSerialized value;

    public JsonItem(CharSequence name, JsonSerialized value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public CharSequence json() {
        final String TEMPLATE = "\"%s\" : %s";
        return String.format(TEMPLATE, name, value.json());
    }
}
