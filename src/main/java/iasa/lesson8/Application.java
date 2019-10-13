package iasa.lesson8;

public class Application {
    public static void main(String[] args) {
        new TryMore(
                8,
                new Logic(
                        new RandomValue(100),
                        new EnteredValue())
        ).loop();
    }

}
