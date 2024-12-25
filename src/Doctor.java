import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person implements Treatable {
    //aggregation
    private String specialization;
    private Supervisor supervisor;
    private List<Patient> patients;

    public Doctor(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
        this.patients=new ArrayList<>();
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be null or empty");
        }
        this.specialization = specialization;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        try {
            if (specialization == null || specialization.trim().isEmpty()) {
                throw new IllegalArgumentException("Specialization cannot be null or empty");
            }
            this.supervisor = supervisor;
        } catch (IllegalArgumentException e) {
            System.out.println("Error:" + e.getMessage());
        }


    }

    public void setPatients(Patient patient) {
        patients.add(patient);
    }

    public void listPatients() {
        System.out.println("Doctor" + getName() + "is treating the following patients:");
        for (Patient patient : patients) {
            System.out.println("\n-" + patient.getName());
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Doctor: " + getName() + " ,Specialization:" + specialization);
    }

    @Override
    public void treat() {
        System.out.println("Doctor " + getName() + " is treating patients");

    }

}
