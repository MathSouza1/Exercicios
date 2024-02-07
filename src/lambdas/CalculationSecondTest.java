package lambdas;

public class CalculationSecondTest {
    public static void main(String[] args) {

        Calculation calculation = (firstValue, secondValue) -> {
            return firstValue + secondValue;
        };

        System.out.println(calculation.execute(2, 3));

        calculation = ((firstValue, secondValue) ->
            firstValue * secondValue
        );
        System.out.println(calculation.execute(2, 3));

        System.out.println(calculation.cool());
        System.out.println(Calculation.veryCool());
    }
}
