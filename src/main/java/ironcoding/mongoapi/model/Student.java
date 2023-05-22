package ironcoding.mongoapi.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.List;

@Data
@Document("students")
public class Student {

    @MongoId
    private String id;
    private String name;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favoriteSubjects;
    private BigDecimal totalSpentInBooks;
    //private LocalDateTime created;

    // Constructor without the id, because is auto generated
    public Student(String name, String email, Gender gender, Address address, List<String> favoriteSubjects, BigDecimal totalSpentInBooks/*, LocalDateTime created*/) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favoriteSubjects = favoriteSubjects;
        this.totalSpentInBooks = totalSpentInBooks;
        //this.created = created;
    }
}
