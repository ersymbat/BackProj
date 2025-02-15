package org.example;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void showStudent(Student student) {
        student.displayInfo(student);
    }
    @Override
    public String checkStudentFor18(Student student){
        String gender;
        if (student.getGender().equals("Male")){
            gender = "He";
        }
        else {
            gender = "She";
        }
        if (student.getAge()>=18){
            return gender + " is older than 18";
        }
        else {
            return gender + " is younger than 18";
        }
    }
}
