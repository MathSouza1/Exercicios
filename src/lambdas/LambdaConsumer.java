package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args) {
        Consumer<Product> printName = print -> System.out.println(print.name + "!!!");
        Product firstProduct = new Product("Caneta", 12.34, 0.09);
        printName.accept(firstProduct);

        Product secondProduct = new Product("Notebook", 2987.99, 0.25);
        Product thirdProduct = new Product("Caderno", 19.90, 0.03);
        Product fourthProduct = new Product("Borracha", 7.80, 0.18);
        Product fifthProduct = new Product("Lapis", 4.39, 0.19);

        List<Product> products = Arrays.asList(firstProduct, secondProduct, thirdProduct, fourthProduct, fifthProduct);

        products.forEach(printName);
        products.forEach(p -> System.out.println(p.price));
        products.forEach(System.out::println);
    }
}
