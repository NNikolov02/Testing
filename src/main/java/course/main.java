package course;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Math");
        Course physicsCourse = new Course("Physics");

        Student student1 = new Student( 101,"John");
        Student student2 = new Student(102, "Emma");
        Student student3 = new Student(103, "Michael");

        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);
        physicsCourse.addStudent(student2);
        physicsCourse.addStudent(student3);

        System.out.println("Math Course Students: " + mathCourse.getStudents());
        System.out.println("Physics Course Students: " + physicsCourse.getStudents());

        mathCourse.removeStudent(student2);
        System.out.println("Math Course Students after removing student2: " + mathCourse.getStudents());

        System.out.println("Number of students in Physics Course: " + physicsCourse.getStudentCount());


    }
}
