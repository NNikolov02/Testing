import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 4));
        StringHelper word = new StringHelper();


        ArrayList<People> people = new ArrayList<>();
        people.add(new Student("Ivan",14,true,3));
        people.add(new Student("Georgi",15,true,5));
        people.add(new Student("Ivana",16,false,6));
        people.add(new Employee("Stamat",30,true,80.0));
        people.add(new Employee("Velizar",28,true,70.5));
        people.add(new Employee("Maria",25,false,60.0));
        people.add(new People("Nikola",20,true));
        people.add(new People("Peter",40,true));
        people.add(new People("Angel",26,true));
        System.out.println(people);
        for (People person : people) {
            person.toString();

            if (person instanceof Student) {
                Student student = (Student) person;
               student.toString();
            } else if (person instanceof Employee) {
                Employee employee = (Employee) person;
                employee.toString();
                System.out.println("Overtime:" + employee.calculateOvertime(12) );
            }

            System.out.println("--------------------");
        }











        Employee employee = new Employee("Ivan",30,true,80.0);
        employee.calculateOvertime(12);




        System.out.println(word.capitalizeFirst("letter"));
        System.out.println(word.isPalindrome("racecar"));




        }





    }


