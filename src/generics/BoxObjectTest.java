package generics;

public class BoxObjectTest {

    public static void main(String[] args) {
        BoxObject firstBox = new BoxObject();
        firstBox.save(2.3);

        Double objectDouble = (Double) firstBox.open();
        System.out.println(objectDouble);

        BoxObject secondBox = new BoxObject();
        secondBox.save("Olá");

        String objectString = (String) secondBox.open();
        System.out.println(objectString);
    }
}
