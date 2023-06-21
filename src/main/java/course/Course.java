package course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor

public class Course {

    String name;
    ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }


    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }

    public int getStudentCount(){
        return students.size();
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
