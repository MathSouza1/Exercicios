package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Student a1 = new Student("Ana", 7.1);
        Student a2 = new Student("Luna", 7.2);
        Student a3 = new Student("Gui", 8.1);
        Student a4 = new Student("Gabi", 10);

        List<Student> Students = Arrays.asList(a1, a2, a3, a4);

        Predicate<Student> aprovado = a -> a.grade >= 7;
        Predicate<Student> reprovado = aprovado.negate();

        System.out.println(Students.stream().allMatch(aprovado));
        System.out.println(Students.stream().anyMatch(aprovado));
        System.err.println(Students.stream().noneMatch(reprovado));
    }
}
