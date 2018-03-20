package iasa.lesson2.n6.json;

public final class JsonString implements JsonSerialized {
    private final String value;

    public JsonString(String value) {
        this.value = value;
    }

    @Override
    public CharSequence json() {
        return String.format("\"%s\"",value);
    }
}
