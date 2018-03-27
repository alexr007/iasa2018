package iasa.lesson6.strategy;

public class BehaviourNormal implements Behaviour {
    public int moveCommand() {
        System.out.println("\tNormal Behaviour");
        return 0;
    }
}
