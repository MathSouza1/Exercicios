package oo.composicao.desafio;

public class App {

    public static void main(String[] args) {
        Purchase purchaseTech = new Purchase();
        purchaseTech.addItem("Caneta", 1, 100);
        purchaseTech.addItem(new Product("Notebook", 2000), 2);

        Purchase purchaseSubject = new Purchase();
        purchaseSubject.addItem("Caderno", 10, 10);
        purchaseSubject.addItem(new Product("Impressora", 1000), 1);

        Client client = new Client("Maria Julia Moraes");
        client.addPurchase(purchaseTech);
        client.purchases.add(purchaseSubject);

        System.out.println(client.getTotalValue());
    }
}
