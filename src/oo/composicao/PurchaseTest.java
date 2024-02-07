package oo.composicao;

public class PurchaseTest {

    public static void main(String[] args) {

        Purchase purchase = new Purchase();
        purchase.client = "João Pedro";

        purchase.addItem("Caneta", 20, 7.45);
        purchase.addItem(new Item("Borracha", 12, 3.89));
        purchase.addItem(new Item("Caderno", 3, 18.79));

        System.out.println(purchase.items.size());
        System.out.println(purchase.getTotalValue());

        // Só pra mostrar a relação bidirecional!!!
        double total = purchase.items.getFirst().purchase.items.get(1).purchase.getTotalValue();
        System.out.println("O total é R$" + total);
    }
}
