package lambdas;

public class Sum implements Calculation{
    @Override
    public double execute(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
