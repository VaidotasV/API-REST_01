package lt.codeacademy.projektas01.model;

import jakarta.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String managerPersonalCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManagerPersonalCode() {
        return managerPersonalCode;
    }

    public void setManagerPersonalCode(String managerPersonalCode) {
        this.managerPersonalCode = managerPersonalCode;
    }

}

