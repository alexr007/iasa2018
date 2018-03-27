package iasa.lesson4;

public class AdderTest {
    public static void main(String[] args) {
        AdderProblem a = new AdderProblem(5);
        System.out.println(a.toString());
        AdderProblem a2 = a.add(5);
        System.out.println(a2.toString());
    }
}
