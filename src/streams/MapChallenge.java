package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapChallenge {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        /*
         * 1. Número para String binária... 6 => "110"
         * 2. Inverter a String... "110" => "011"
         * 3. Converter de volta para número => "001" => 3
         */
        UnaryOperator<String> inverter =
                string -> new StringBuilder(string).reverse().toString();
        Function<String, Integer> binarioParaInt =
                string -> Integer.parseInt(string, 2);

        numbers.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }
}
