package lt.codeacademy.projektas01.service;

import lt.codeacademy.projektas01.model.Employee;
import lt.codeacademy.projektas01.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Darbuotojas nerastas su ID: " + id));
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee existingEmployee = getEmployeeById(id);

        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setLastName(updatedEmployee.getLastName());
        existingEmployee.setPersonalCode(updatedEmployee.getPersonalCode());
        existingEmployee.setBirthDate(updatedEmployee.getBirthDate());
        existingEmployee.setWorksFrom(updatedEmployee.getWorksFrom());
        existingEmployee.setPosition(updatedEmployee.getPosition());
        existingEmployee.setDepartment(updatedEmployee.getDepartment());
        existingEmployee.setProject(updatedEmployee.getProject());

        return employeeRepository.save(existingEmployee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

