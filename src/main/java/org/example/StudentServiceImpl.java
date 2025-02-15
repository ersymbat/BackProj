package org.example;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final Student student;

    public StudentServiceImpl() {
        this.student = new Student("Ersymbat", 19);
    }

    @Override
    public void showStudent() {
        student.displayInfo();
    }
}
