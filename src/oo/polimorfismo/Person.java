package oo.polimorfismo;

public class Person {
    private double weight;

    public Person(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0){
            this.weight = weight;
        }
    }

    public void eat(Food food){
        this.weight += food.getWeight();
    }
}
