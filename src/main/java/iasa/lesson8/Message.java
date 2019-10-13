package iasa.lesson8;

public class Message {
    private final SolutionValue solution;

    public Message(SolutionValue solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        switch (solution) {
            case Greater : return "Your number greater than original";
            case Lower : return "Your number lower than original";
            case Equal : return "Your number Equal original";
            default : throw new IllegalArgumentException("enum...");
        }
    }
}
