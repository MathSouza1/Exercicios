package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class LambdaBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Double> average = (firstNumber, secondNumber) -> (firstNumber + secondNumber) / 2;
        System.out.println(average.apply(9.8, 5.7));

        BiFunction<Double, Double, String> result = (firstNumber, secondNumber) -> {
            double finalGrade = (firstNumber + secondNumber) / 2;
            return finalGrade >= 7 ? "Approved" : "Repproved";
        };

        System.out.println(result.apply(9.7, 4.1));
        Function<Double, String> concept = m ->  m >= 7 ? "Approved" : "Repproved";

        System.out.println(average.andThen(concept).apply(9.7, 5.1));
    }
}
