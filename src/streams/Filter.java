package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Student a1 = new Student("Ana", 7.8, false);
        Student a2 = new Student("Bia", 5.8, true);
        Student a3 = new Student("Daniel", 9.8, true);
        Student a4 = new Student("Gui", 6.8, true);
        Student a5 = new Student("Rebeca", 7.1, true);
        Student a6 = new Student("Pedro", 8.8, false);

        List<Student> Students = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Student> aprovado = a -> a.grade >= 7;
        Predicate<Student> bomComportamento = a -> a.goodBehavior;
        Function<Student, String> saudacaoAprovado =
                a -> "Parabéns " + a.name + "! Você foi aprovado(a)!";

        Students.stream()
                .filter(aprovado)
                .filter(bomComportamento)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
