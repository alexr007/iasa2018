package iasa.lesson6.strategy;

public class Robot {
    Behaviour behaviour;
    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void setBehaviour(Behaviour b) {
        this.behaviour = b;
    }

    public void move() {
        System.out.printf("Name:%s: %2d ",name, behaviour.moveCommand());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
