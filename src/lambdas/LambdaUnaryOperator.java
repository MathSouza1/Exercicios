package lambdas;

import java.util.function.UnaryOperator;

public class LambdaUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> plusTwo = number -> number + 2;
        UnaryOperator<Integer> timerTwo = number -> number * 2;
        UnaryOperator<Integer> squared = number -> number * number;

        int firstResult = plusTwo
                .andThen(timerTwo)
                .andThen(squared)
                .apply(0);
        System.out.println(firstResult);

        int secondResult = squared
                .compose(timerTwo)
                .compose(plusTwo)
                .apply(0);
        System.out.println(secondResult);
    }
}
