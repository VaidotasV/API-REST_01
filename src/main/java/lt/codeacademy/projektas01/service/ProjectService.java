package lt.codeacademy.projektas01.service;

import lt.codeacademy.projektas01.model.Project;
import lt.codeacademy.projektas01.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }
}

