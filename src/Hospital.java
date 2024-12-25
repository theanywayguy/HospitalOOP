import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private List<Department> departments = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void addDepartment(String deptName, Supervisor supervisor) {
        try {
            if (deptName == null || deptName.trim().isEmpty()) {
                throw new IllegalArgumentException("Department name cannot be null or empty");
            }
            if (supervisor == null) {
                throw new IllegalArgumentException("Supervisor cannot be null");
            }
            Department department = new Department(deptName, supervisor);
            departments.add(department);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void listDepartments() {
        System.out.println("Departments in " + hospitalName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getDeptName());
        }
    }

}
