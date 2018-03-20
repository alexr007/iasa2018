package iasa.lesson2.n6.json;

public final class JsonInteger implements JsonSerialized {
    private final int value;

    public JsonInteger(int value) {
        this.value = value;
    }

    @Override
    public CharSequence json() {
        return Integer.toString(value);
    }
}
