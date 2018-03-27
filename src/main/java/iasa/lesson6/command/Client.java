package iasa.lesson6.command;

// Client
public class Client {
    public static void main(String[] args) {
        StockTrade stock = new StockTrade();
        BuyStockOrder bsc = new BuyStockOrder (stock);
        SellStockOrder ssc = new SellStockOrder (stock);


        Agent agent = new Agent();
        agent.placeCommand(bsc); // Buy Shares
        agent.placeCommand(ssc); // Sell Shares
        agent.placeCommand(new Order() {
            @Override
            public void execute() {
                System.out.println("test");
            }
        });
    }
}