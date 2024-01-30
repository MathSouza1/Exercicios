package generics;

public class BoxIntegerTest {

    public static void main(String[] args) {

        BoxInteger firstBox = new BoxInteger();
        firstBox.save(123);

        Integer objectInteger = firstBox.open();
        System.out.println(objectInteger);
    }
}
