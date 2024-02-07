package oo.composicao;

public class CourseTest {

    public static void main(String[] args) {

        Student aluno1 = new Student("João");
        Student aluno2 = new Student("Maria");
        Student aluno3 = new Student("Pedro");

        Course curso1 = new Course("Java Completo");
        Course curso2 = new Course("Web 2023");
        Course curso3 = new Course("React Native");


        curso1.addStudent(aluno1);
        curso1.addStudent(aluno2);

        curso2.addStudent(aluno1);
        curso2.addStudent(aluno3);

        aluno1.addCourse(curso3);
        aluno2.addCourse(curso3);
        aluno3.addCourse(curso3);

        for(Student aluno: curso3.students) {
            System.out.println("Estou matriculado no curso "
                    + curso3.name + "...");
            System.out.println("...e o meu nome é " + aluno.name);
            System.out.println();
        }

        System.out.println(aluno1.courses.getFirst().students);

        Course cursoEncontrado = aluno1.getCourseByName("Java Completo");

        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.name);
            System.out.println(cursoEncontrado.students);
        }
    }
}
