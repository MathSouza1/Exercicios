package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterChallenge {

    public static void main(String[] args) {

        Product p1 = new Product("Lapis", 1.99, 0.35, 0);
        Product p2 = new Product("Notebook", 4899.89, 0.32, 0);
        Product p3 = new Product("Caderno", 30, 0.45, 0);
        Product p4 = new Product("Impressora", 1200, 0.40, 0);
        Product p5 = new Product("iPad", 3100, 0.29, 0);
        Product p6 = new Product("Relogio", 1900, 0.12, 0);
        Product p7 = new Product("Monitor", 800, 0.31, 0);

        List<Product> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        // Filter, filter, map
        Predicate<Product> superPromocao = p -> p.discount >= 0.3;
        Predicate<Product> freteGratis = p -> p.shippingValue == 0;
        Predicate<Product> precoRelevante = p -> p.price >= 500;
        Function<Product, String> chamadaPromocional = p -> "Aproveite! " + p.name + " por R$" + p.price;

        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(precoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

    }
}