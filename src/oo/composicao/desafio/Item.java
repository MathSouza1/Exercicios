package oo.composicao.desafio;

public class Item {
    int quantity;
    final Product product;

    public Item(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }
}
