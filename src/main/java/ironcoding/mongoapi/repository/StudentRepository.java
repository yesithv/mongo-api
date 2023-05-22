package ironcoding.mongoapi.repository;

import ironcoding.mongoapi.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findStudentsByNameIgnoreCaseContaining(String studentName);
}
