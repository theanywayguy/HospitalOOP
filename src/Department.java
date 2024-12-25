import java.util.ArrayList;
import java.util.List;

public class Department {
    private String deptName;
    private List<Doctor> doctors;
    private List<Patient> Patients;
    private Supervisor supervisor;

    public Department(String deptName, Supervisor supervisor) {
        this.deptName = deptName;
        this.supervisor = supervisor;
        this.doctors = new ArrayList<>();
        this.Patients = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        try {
            if (deptName == null || deptName.trim().isEmpty()) {
                throw new IllegalArgumentException("Department name cannot be null or empty");
            }
            this.deptName = deptName;
        } catch (IllegalArgumentException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }


    public void addDoctors(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getDoctors() {
        return new ArrayList<>(doctors);
    }

    public List<Patient> getPatients() {
        return Patients;
    }

    public void addPatients(Patient patient) {
        Patients.add(patient);
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }
}
