package sample;

import java.util.List;

public class Admin {
    private Shop aShop = new Shop();
    int price;
    String name;
    String info;
    private List<Product> listOfProduct;

    public void addProduct(){}

    public List<Product> getListOfProduct() {
        return listOfProduct;
    }

    public void editProduct(Product t){
        t.setName(name);
        t.setPrice(price);
        t.setInformation(info);
    }
    public void deleteProduct(Product t){}
}
