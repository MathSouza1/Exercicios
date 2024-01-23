package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.LongBinaryOperator;

public class Foreach {

    public static void main(String[] args) {

        List<String> approved = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for(String name: approved) {
            System.out.println(name);
        }

        System.out.println("\nLambda #01...");
        approved.forEach(name -> System.out.println(name + "!!!"));

        System.out.println("\nMethod Reference #01...");
        approved.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        approved.forEach(name -> printMe(name));

        System.out.println("\nMethod Reference #02...");
        approved.forEach(Foreach::printMe);
    }

    static void printMe(String name) {
        System.out.println("Hey! My name is " + name);
    }
}
