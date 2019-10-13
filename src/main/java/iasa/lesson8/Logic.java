package iasa.lesson8;

public class Logic {
    private final int origin;
    private final EnteredValue eValue;

    public Logic(RandomValue origin, EnteredValue eEalue) {
        this.origin = origin.value();
        this.eValue = eEalue;
    }

    public int originalValue() {
        return origin;
    }

    public Step makeNext() {
        SolutionValue solution = solution();
        return new Step(
                new Message(solution).toString(),
                solution == SolutionValue.Equal);
    }

    private SolutionValue solution() {
        int val=eValue.value();
        int diff = val-this.origin;
        return diff>0 ? SolutionValue.Greater :
               diff<0 ? SolutionValue.Lower :
               SolutionValue.Equal;
    }
}
