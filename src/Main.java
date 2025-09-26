import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Tom" , "Riddle");
        Student student1 = new Student("Harry", "Potter", 3.25);
        Employee employee1 = new Employee("Rubeus", "Hagrid", 50000);

        person1.showName();
        student1.showName();
        System.out.println(student1.gpa);
        System.out.println(student1.first);

        student1.showGPA();
        employee1.showSalary();
    }
}
