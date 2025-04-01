package lt.codeacademy.projektas01.repository;

import lt.codeacademy.projektas01.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
