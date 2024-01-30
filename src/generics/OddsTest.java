package generics;

public class OddsTest {

    public static void main(String[] args) {

        Odds<Integer, String> constestResult = new Odds<>();

        constestResult.add(1, "Maria");
        constestResult.add(2, "Pedro");
        constestResult.add(3, "Gui");
        constestResult.add(4, "Ana");
        constestResult.add(2, "Rebeca");

        System.out.println(constestResult.getValue(1));
        System.out.println(constestResult.getValue(4));
        System.out.println(constestResult.getValue(2));
    }
}
