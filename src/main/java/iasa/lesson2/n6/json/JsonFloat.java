package iasa.lesson2.n6.json;

public final class JsonFloat implements JsonSerialized {
    private final float value;

    public JsonFloat(float value) {
        this.value = value;
    }

    @Override
    public CharSequence json() {
        return Float.toString(value);
    }
}
