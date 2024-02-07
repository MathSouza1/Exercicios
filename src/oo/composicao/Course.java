package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Course {

    final String name;
    final List<Student> students = new ArrayList<>();

    Course(String nome) {
        this.name = nome;
    }

    void addStudent(Student student) {
        this.students.add(student);
        student.courses.add(this);
    }
}
