package iasa.lesson6.strategy;

public class StratedyDesignExample {
    public static void main(String[] args) {
        Robot r1 = new Robot("Robot 1");
        Robot r2 = new Robot("Robot 2");
        Robot r3 = new Robot("Robot 3");

        r1.setBehaviour(new BehaviourAgressive());
        r2.setBehaviour(new BehaviourDefensive());
        r3.setBehaviour(new BehaviourNormal());

        r1.move();
        r2.move();
        r3.move();

        r1.setBehaviour(new BehaviourDefensive());
        r2.setBehaviour(new BehaviourAgressive());

        r1.move();
        r2.move();
        r3.move();
    }
}
