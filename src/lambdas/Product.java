package lambdas;

public class Product extends Object {

    final String name;
    final double price;
    final double discount;

    public Product(String nome, double preco, double desconto) {
        this.name = nome;
        this.price = preco;
        this.discount = desconto;
    }

    public String toString() {
        double finalPrice = price * (1 - discount);
        return name + " tem preço de R$" + finalPrice;
    }
}
