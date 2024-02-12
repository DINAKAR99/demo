package demo.Map1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Emp {
    @Id
    @Column(name = "Emp_Id")
    private int empId;
    private String empName;
    @ManyToMany

    private List<Project> projects;

    public Emp() {
    }

    public Emp(int empId, String empName, List<Project> projects) {
        this.empId = empId;
        this.empName = empName;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Emp [empId=" + empId + ", empName=" + empName + ", projects=" + projects + "]";
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
