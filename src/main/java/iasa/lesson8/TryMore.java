package iasa.lesson8;

public class TryMore {
    private final int maxTries;
    private int currentTry = 0;
    private final Logic logic;

    public TryMore(int maxTries, Logic logic) {
        this.maxTries = maxTries;
        this.logic = logic;
    }

    void loop() {
        while (currentTry++ < maxTries) {
            Step step = logic.makeNext();
            System.out.println(step.message());
            if (step.isSuccess()) {
                return;
            }
        }
        System.out.printf("Original value was:%d\n", logic.originalValue());
    }
}
