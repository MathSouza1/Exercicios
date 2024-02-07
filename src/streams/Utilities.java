package streams;

import java.util.function.UnaryOperator;

public class Utilities {
    private Utilities() {

    }

    public final static UnaryOperator<String> upperCase =
            n -> n.toUpperCase();

    public final static UnaryOperator<String> firstLetter =
            n -> n.charAt(0) + "";

    public final static String scream(String n) {
        return n + "!!! ";
    }
}
