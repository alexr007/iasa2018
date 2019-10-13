package iasa.lesson8;

import java.util.Random;

public class RandomValue {
    private final int origin;

    public RandomValue(int max) {
        this.origin = new Random().nextInt(max);
    }

    public int value() {
        return origin;
    }
}
