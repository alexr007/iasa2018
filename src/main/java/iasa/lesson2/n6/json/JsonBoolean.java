package iasa.lesson2.n6.json;

public final class JsonBoolean implements JsonSerialized {
    private final boolean value;

    public JsonBoolean(boolean value) {
        this.value = value;
    }

    @Override
    public CharSequence json() {
        return Boolean.toString(value);
    }
}
