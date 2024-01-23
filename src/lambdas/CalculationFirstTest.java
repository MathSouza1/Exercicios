package lambdas;

public class CalculationFirstTest {
    public static void main(String[] args) {
        Calculation calculation = new Sum();
        System.out.println(calculation.execute(2, 3));

        calculation = new Multiply();
        System.out.println(calculation.execute(2, 3));
    }
}
