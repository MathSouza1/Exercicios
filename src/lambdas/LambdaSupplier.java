package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class LambdaSupplier {
    public static void main(String[] args) {
        Supplier<List<String>> firstList = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println(firstList.get());
    }
}
