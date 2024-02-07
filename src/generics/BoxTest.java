package generics;

public class BoxTest {

    public static void main(String[] args) {

        Box<String> firstBox = new Box<>();
        firstBox.save("Secret!");

        String objectString = firstBox.open();
        System.out.println(objectString);

        Box<Double> secondBox = new Box<>();
        secondBox.save(3.1415);

        Double objectDouble = secondBox.open();
        System.out.println(objectDouble);
    }
}
