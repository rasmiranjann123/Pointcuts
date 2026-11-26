package in.strikes.SpringAOPPointcut.controler;

import in.strikes.SpringAOPPointcut.dto.Student;
import in.strikes.SpringAOPPointcut.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentControler {

    private StudentService studentService;

    public StudentControler(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){

        Student result=studentService.createStudent(student);

        return ResponseEntity.ok(result);
    }


    @GetMapping
    public ResponseEntity<String> getAllStudent(){
        String s="Get All Student";

        return ResponseEntity.ok(studentService.getAllStudent(s));
    }
}
