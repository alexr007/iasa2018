package iasa.lesson6.strategy;

public class StratedyDesignExample {
    public static void main(String[] args) {
        Robot r1 = new Robot("Robot 1");
        Robot r2 = new Robot("Robot 2");
        Robot r3 = new Robot("Robot 3");

        Behaviour b1 = new BehaviourAgressive();
        Behaviour b2 = new BehaviourDefensive();
        Behaviour b3 = new BehaviourNormal();

        r1.setBehaviour(b1);
        r2.setBehaviour(b2);
        r3.setBehaviour(b3);

        r1.move();
        r2.move();
        r3.move();

        r1.setBehaviour(b2);
        r2.setBehaviour(b3);

        r1.move();
        r2.move();
        r3.move();
    }
}
