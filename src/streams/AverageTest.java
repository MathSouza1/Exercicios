package streams;

public class AverageTest {
    public static void main(String[] args) {

        Average m1 = new Average().add(8.3).add(6.7);
        Average m2 = new Average().add(7.9).add(6.6);

        System.out.println(m1.getValue());
        System.out.println(m2.getValue());

        System.out.println(Average.combine(m1, m2).getValue());
    }
}
