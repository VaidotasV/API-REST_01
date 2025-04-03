package lt.codeacademy.projektas01.model;

import java.time.LocalDate;

public class EmployeeDTO {
    private String personalCode;
    private String name;

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setWorksFrom(LocalDate worksFrom) {
        this.worksFrom = worksFrom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    private String lastName;
    private String position;
    private Long id;

    public Long getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getWorksFrom() {
        return worksFrom;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Long getProjectId() {
        return projectId;
    }

    private LocalDate birthDate;
    private LocalDate worksFrom;
    private Long departmentId;
    private Long projectId;

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

