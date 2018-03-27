package iasa.lesson6.strategy;

public class BehaviourAgressive implements Behaviour {
    public int moveCommand() {
        System.out.println("\tAgressive Behaviour");
        return 1;
    }
}
