package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StudentService studentService = context.getBean(StudentService.class);
        Student ers = context.getBean(Student.class);
        ers.setName("Ers");
        ers.setAge(19);
        ers.setGender("Male");

        studentService.showStudent(ers);
        System.out.println(studentService.checkStudentFor18(ers));


    }
}