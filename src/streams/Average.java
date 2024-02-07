package streams;

public class Average {
    private double total;
    private int quantity;

    public Average add(double value){
        total += value;
        quantity++;
        return this;
    }

    public double getValue(){
        return total / quantity;
    }

    public static Average combine(Average firstAverage, Average secondAverage) {
        Average average = new Average();
        average.total = firstAverage.total + secondAverage.total;
        average.quantity = firstAverage.quantity + secondAverage.quantity;
        return average;
    }
}
