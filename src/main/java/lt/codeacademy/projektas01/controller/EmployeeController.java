package lt.codeacademy.projektas01.controller;
import lt.codeacademy.projektas01.model.EmployeeDTO;
import lt.codeacademy.projektas01.model.EmployeeMapper;
import lt.codeacademy.projektas01.model.Employee;
import lt.codeacademy.projektas01.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.stream.Collectors;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees.stream()
                .map(EmployeeMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = employeeService.getEmployeeById(id);
        return EmployeeMapper.toDTO(employee);
    }

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.toEntity(employeeDTO);
        Employee savedEmployee = employeeService.createEmployee(employee);
        return EmployeeMapper.toDTO(savedEmployee);
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable("id") Long id, @RequestBody EmployeeDTO updatedEmployeeDTO) {
        Employee updatedEmployee = EmployeeMapper.toEntity(updatedEmployeeDTO);
        Employee savedEmployee = employeeService.updateEmployee(id, updatedEmployee);
        return EmployeeMapper.toDTO(savedEmployee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }
}
