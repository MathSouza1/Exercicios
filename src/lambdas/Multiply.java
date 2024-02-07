package lambdas;

public class Multiply implements Calculation {
    @Override
    public double execute(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }
}
