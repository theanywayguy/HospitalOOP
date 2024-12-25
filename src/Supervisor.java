public class Supervisor extends Person implements Managers {
    public Supervisor(String name, int id) {
        super(name, id);
    }

    public void assignPatients(Doctor doctor, Patient patient) {
        try {
            if (doctor == null || patient == null) {
                throw new IllegalArgumentException("Doctor and Patient cannot be null");
            }
            doctor.setPatients(patient);
            patient.setTreatingDoctor(doctor);
        } catch (IllegalArgumentException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public void Manages(Doctor doctor) {
        doctor.setSupervisor(this);

    }

    @Override
    public void showDetails() {
        System.out.println("Supervisor:" + getName() + " manages some doctors");
    }
}
