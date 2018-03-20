package iasa.lesson1.n6;

import java.util.Scanner;

public class InputFromKeyboard implements Input {
    private final Scanner in;
    private String readed;

    public InputFromKeyboard() {
        in = new Scanner(System.in);
        readed = "";
    }

    @Override
    public String get() {
        readed = in.next();
        return readed;
    }

    @Override
    public boolean has() {
        return !readed.equals("bye");
    }
}
