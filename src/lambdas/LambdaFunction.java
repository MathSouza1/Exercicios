package lambdas;

import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args) {

        Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "even" : "odd";

        Function<String, String> oResultadoE =
                value -> "The result is: " + value;

        Function<String, String> empolgado =
                value -> value + "!!!";

        Function<String, String> duvida =
                value -> value + "???";

        String firstFinalResult = evenOrOdd
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);
        System.out.println(firstFinalResult);

        String secondFinalResult = evenOrOdd
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(33);
        System.out.println(secondFinalResult);

        System.out.println(evenOrOdd.apply(32));
    }
}
