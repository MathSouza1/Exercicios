package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Student {

    final String name;
    final List<Course> courses = new ArrayList<>();

    Student(String nome) {
        this.name = nome;
    }



    public String toString() {
        return name;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }

    Course getCourseByName(String nome) {
        for(Course curso: this.courses) {
            if(curso.name.equalsIgnoreCase(nome)) {
                return curso;
            }
        }

        return null;
    }
}
