package oo.composicao.desafio;

import oo.composicao.Item;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String name;
    List<Purchase> purchases = new ArrayList<>();

    public Client(String name) {
        this.name = name;
    }

    void addPurchase(Purchase purchase){
        this.purchases.add(purchase);
    }
    double getTotalValue() {
        double total = 0;
        for(Purchase purchase: purchases) {
            total += purchase.getTotalValue();
        }
        return total;
    }
}
