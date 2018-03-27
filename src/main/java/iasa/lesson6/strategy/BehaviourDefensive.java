package iasa.lesson6.strategy;

public class BehaviourDefensive implements Behaviour {
    public int moveCommand() {
        System.out.println("Defensive Behaviour");
        return -1;
    }
}
