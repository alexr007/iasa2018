package iasa.lesson8;

public class Step {
    private final String message;
    private final boolean success;

    public Step(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public String message() {
        return this.message;
    }

    public boolean isSuccess() {
        return this.success;
    }
}
