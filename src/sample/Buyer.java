package sample;

public class Buyer {
    Product t = new Product();
    private PlasticCard card = new PlasticCard();
    private Basket аBasket = new Basket();
    private Shop aShop = new Shop();
    private int money;


    public String returnCard(PlasticCard card){
        return card.getPIN();
    }

    private void takeBasket(){}

    private String chooseProduct(Product t){
        return t.getName();
    }

    private void putOutFromBasket(Product t){
        аBasket.deleteProduct(t);
    }

    private void putInBasket(Product t){
        аBasket.addProduct(t);
    }

    private void payByCard(){}

    public void payByCash(){}

    public void takeChange(){}

    private void readInfo(Product t){
        t.getInformation();
    }
}
