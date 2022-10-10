package School;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        String student1_id = "1020476859";
        String student1_name = "Pepe";
        String student1_lastName = "Meneses";
        LocalDate student1_dateOfBirth = LocalDate.of(2006, 3, 2);
        Student pepe = new Student(student1_id, student1_name, student1_lastName, student1_dateOfBirth,10);

        System.out.println(pepe.toString());

        List<Student> studentList = new ArrayList<>();
        studentList.add(pepe);


        String teacher1_id = "32389632";
        String teacher1_name = "Juan";
        String teacher1_lastName = "Herrera";
        LocalDate teacher1_dateOfBirth = LocalDate.of(1990, 9, 3);
        Teacher juan = new Teacher(teacher1_id, teacher1_name, teacher1_lastName, teacher1_dateOfBirth,2500000);

        System.out.println(juan.toString());

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(juan);


    }

}
