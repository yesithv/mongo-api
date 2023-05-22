package ironcoding.mongoapi.service;

import ironcoding.mongoapi.model.Student;
import ironcoding.mongoapi.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getStudentByName(String studentName) {
        return studentRepository.findStudentsByNameIgnoreCaseContaining(studentName);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.insert(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

}
