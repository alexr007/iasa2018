package iasa.lesson6.command;

// Invoker.
class Agent {
    void placeCommand(Order order) {
        order.execute();
    }
}
