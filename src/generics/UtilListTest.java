package generics;

import java.util.Arrays;
import java.util.List;

public class UtilListTest {

    public static void main(String[] args) {
        List<String> programingLanguages = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        String lastLanguage = (String) UtilList.getLastObject(programingLanguages);
        System.out.println(lastLanguage);

        Integer lastNumber = (Integer) UtilList.getLastObject(numbers);
        System.out.println(lastNumber);

        String lastLanguageT = UtilList.getLastT(programingLanguages);
        System.out.println(lastLanguageT);

        Integer lastNumberT = UtilList.<Integer>getLastT(numbers);
        System.out.println(lastNumberT);
    }
}
