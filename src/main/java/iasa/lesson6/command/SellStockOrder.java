package iasa.lesson6.command;

//ConcreteCommand Class.
class SellStockOrder implements Order {
    private StockTrade stock;
    public SellStockOrder ( StockTrade st) {
        stock = st;
    }
    @Override
    public void execute() {
        stock.sell();
    }
}
