package iasa.lesson1.n6;

public class LogicTest {
    public static void main(String[] args) {

        Input in = new InputFromKeyboard();
        Output out = new Output() {
            @Override
            public void put(String s) {
                System.out.println(s);
            }

            @Override
            public void done() {
                System.out.println("Good bye...");
            }
        };
        ProcessOne prc = new ProcessOne();
        Logic logic = new Logic(in, out, prc);

        logic.run();
    }
}
