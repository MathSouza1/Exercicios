package generics;

public class BoxNumberTest {

    public static void main(String[] args) {

        BoxNumber<Double> firstBox = new BoxNumber<>();
        firstBox.save(2.3);
        System.out.println(firstBox.open());

        BoxNumber<Integer> secondBox = new BoxNumber<>();
        secondBox.save(123);
        System.out.println(secondBox.open());
    }
}
