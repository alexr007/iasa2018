package iasa.lesson6.command;

//ConcreteCommand Class.
class BuyStockOrder implements Order {
    private StockTrade stock;
    public BuyStockOrder ( StockTrade st) {
        stock = st;
    }
    @Override
    public void execute() {
        stock.buy();
    }
}
