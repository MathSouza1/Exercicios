package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {
    public static void main(String[] args) {

        List<String> approveds = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Usando o foreach...");
        for(String nome: approveds) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = approveds.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream...");
        Stream<String> stream = approveds.stream();
        stream.forEach(System.out::println); // Laço interno!!!
    }
}
