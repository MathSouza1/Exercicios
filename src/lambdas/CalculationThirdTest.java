package lambdas;

import java.util.function.BinaryOperator;

public class CalculationThirdTest {
    public static void main(String[] args) {
        BinaryOperator<Double> firstCalculate = (firstValue, secondValue) -> {
            return firstValue + secondValue;
        };
        System.out.println(firstCalculate.apply(2.0, 3.0));

        firstCalculate = (x, y) -> x * y;
        System.out.println(firstCalculate.apply(2.0, 3.0));

        BinaryOperator<Integer> secondCalculate = (firstValue, secondValue) -> {
            return firstValue + secondValue;
        };
        System.out.println(secondCalculate.apply(2, 3));

        firstCalculate = (x, y) -> x * y;
        System.out.println(secondCalculate.apply(2, 3));
    }
}
