package in.strikes.SpringAOPPointcut.service;

import in.strikes.SpringAOPPointcut.dto.Student;
import jdk.jfr.Timestamp;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Timestamp
    public Student createStudent(Student student){

        System.out.println("Student Saved");

        return student;
    }


    public String getAllStudent(String s){
        System.out.println(s);

        return s;
    }
}
