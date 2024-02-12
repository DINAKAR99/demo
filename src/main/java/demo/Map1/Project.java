package demo.Map1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
    @Override
    public String toString() {
        return "Project [projectId=" + projectId + ", projectName=" + projectName + ", employees=" + employees + "]";
    }

    public Project(int projectId, String projectName, List<Emp> employees) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.employees = employees;
    }

    @Id
    private int projectId;
    private String projectName;
    @ManyToMany(mappedBy = "projects")
    private List<Emp> employees;

    public Project() {
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Emp> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Emp> employees) {
        this.employees = employees;
    }

}
