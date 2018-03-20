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
        Process prc = new Process() {
            @Override
            public String process(String src) {
                return src.toUpperCase();
            }
        };
        Logic logic = new Logic(in, out, prc);

        logic.run();
    }
}
