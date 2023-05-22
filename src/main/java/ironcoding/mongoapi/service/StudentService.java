package ironcoding.mongoapi.service;

import ironcoding.mongoapi.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(String id);

    List<Student> getStudentByName(String name);

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(String id);
}
