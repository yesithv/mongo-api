package ironcoding.mongoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoApiApplication.class, args);
    }


    /*@Bean
    CommandLineRunner runner(StudentRepository studentRepository) {
        return args -> {
            var address = new Address("Colombia", "Santander", "Bucaramanga", null);
            var student = new Student("Jhon", "jdoe@gmail.com", Gender.MALE, address, List.of("Computer", "science"), BigDecimal.TEN, LocalDateTime.now());
            studentRepository.insert(student);
        };
    }*/

}
