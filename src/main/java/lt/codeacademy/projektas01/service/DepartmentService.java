package lt.codeacademy.projektas01.service;

import lt.codeacademy.projektas01.model.Department;
import lt.codeacademy.projektas01.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department updateDepartment(Long id, Department updatedDepartment) {
        Department existingDepartment = departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Departamentas nerastas su ID: " + id));

        existingDepartment.setTitle(updatedDepartment.getTitle());
        existingDepartment.setManagerPersonalCode(updatedDepartment.getManagerPersonalCode());

        return departmentRepository.save(existingDepartment);
    }


    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }


}

