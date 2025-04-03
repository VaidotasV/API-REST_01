package lt.codeacademy.projektas01.model;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import jakarta.persistence.ManyToOne;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private String personalCode;
    private LocalDate birthDate;
    private LocalDate worksFrom;
    private String position;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

}
