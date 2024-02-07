package lambdas;

import java.util.function.Predicate;

public class LambdaPredicateComposition {
    public static void main(String[] args) {
        Predicate<Integer> isOdd = number -> number % 2 == 0;
        Predicate<Integer> isThreeDigit = number -> number >= 100 & number <= 999;
        System.out.println(isOdd.and(isThreeDigit).negate().test(123));
        System.out.println(isOdd.or(isThreeDigit).test(123));
    }
}
