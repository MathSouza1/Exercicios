package lambdas;

@FunctionalInterface
public interface Calculation {
    double execute(double firstValue, double secondValue);
    default String cool(){
        return "cool";
    }

    static String veryCool(){
        return "very cool";
    }
}
