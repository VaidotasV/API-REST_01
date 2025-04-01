package lt.codeacademy.projektas01.repository;

import lt.codeacademy.projektas01.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

