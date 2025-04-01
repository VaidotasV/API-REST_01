package lt.codeacademy.projektas01.model;

public class EmployeeMapper {

    public static EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setLastName(employee.getLastName());
        dto.setPersonalCode(employee.getPersonalCode());
        dto.setBirthDate(employee.getBirthDate());
        dto.setWorksFrom(employee.getWorksFrom());
        dto.setPosition(employee.getPosition());
        dto.setDepartmentId(employee.getDepartment() != null ? employee.getDepartment().getId() : null);
        dto.setProjectId(employee.getProject() != null ? employee.getProject().getId() : null);
        return dto;
    }

    public static Employee toEntity(EmployeeDTO dto) {
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setName(dto.getName());
        employee.setLastName(dto.getLastName());
        employee.setPersonalCode(dto.getPersonalCode());
        employee.setBirthDate(dto.getBirthDate());
        employee.setWorksFrom(dto.getWorksFrom());
        employee.setPosition(dto.getPosition());

        Department department = new Department();
        department.setId(dto.getDepartmentId());
        employee.setDepartment(department);

        Project project = new Project();
        project.setId(dto.getProjectId());
        employee.setProject(project);

        return employee;
    }
}

