package ironcoding.mongoapi.rest;

import ironcoding.mongoapi.model.Student;
import ironcoding.mongoapi.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mongo-api/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping()
    public List<Student> fetchAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("id/{idStudent}")
    public Student fetchStudentById(@PathVariable String idStudent) {
        return studentService.getStudentById(idStudent);
    }

    @GetMapping("name/{studentName}")
    public List<Student> fetchStudentsByName(@PathVariable String studentName) {
        return studentService.getStudentByName(studentName);
    }

    @PostMapping()
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping()
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{idStudent}")
    public void deleteStudent(@PathVariable String idStudent) {
        studentService.deleteStudent(idStudent);
    }
}
