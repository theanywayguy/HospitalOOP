import javax.print.Doc;

public class Patient extends Person {
    private Doctor treatingDoctor;

    public Patient(String name, int id, Doctor doctor) {
        super(name, id);
        this.treatingDoctor = doctor;
    }

    public Doctor getTreatingDoctor() {
        return treatingDoctor;
    }

    public void setTreatingDoctor(Doctor treatingDoctor) {
        try {
            if (treatingDoctor == null) {
                throw new IllegalArgumentException("Treating doctor cannot be null");
            }

            this.treatingDoctor = treatingDoctor;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //association
    public void treatedBy(Doctor doctor) {
        setTreatingDoctor(doctor);
        System.out.println("Patient's doctor is:Dr." + doctor.getName());

    }

    @Override
    public void showDetails() {
        String doctorname = (treatingDoctor != null) ? treatingDoctor.getName() : "NO DOCTOR ASSIGNED";
        System.out.println(getName() + "(ID:" + getId() + ") is being treated by: " + doctorname);
    }
}
