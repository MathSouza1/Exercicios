package streams;

public class Product {
    final String name;
    final double price;
    final double discount;
    final double shippingValue;

    public Product(String name, double price, double discount, double shippingValue){
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.shippingValue = shippingValue;
    }
}
