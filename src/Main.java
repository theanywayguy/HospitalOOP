public class Main {
    public static void main(String[] args) {
        try {
            // Create a hospital
            Hospital hospital = new Hospital("City General Hospital");

            // Create supervisors
            Supervisor supervisor1 = new Supervisor("Dr. Smith", 1);
            Supervisor supervisor2 = new Supervisor("Dr. Johnson", 2);

            // Create departments
            hospital.addDepartment("Cardiology", supervisor1);
            hospital.addDepartment("Neurology", supervisor2);

            // Create doctors
            Doctor doctor1 = new Doctor("Dr. Alice", 101, "Cardiology");
            Doctor doctor2 = new Doctor("Dr. Bob", 102, "Neurology");

            // Add doctors to departments
            hospital.getDepartments().get(0).addDoctors(doctor1);
            hospital.getDepartments().get(1).addDoctors(doctor2);

            // Create patients
            Patient patient1 = new Patient("John Doe", 201, doctor1);
            Patient patient2 = new Patient("Jane Smith", 202, doctor2);

            // Add patients to departments
            hospital.getDepartments().get(0).addPatients(patient1);
            hospital.getDepartments().get(1).addPatients(patient2);

            // Assign supervisor to doctors
            supervisor1.Manages(doctor1);
            supervisor2.Manages(doctor2);

            // Assign patients to doctors
            supervisor1.assignPatients(doctor1, patient1);
            supervisor2.assignPatients(doctor2, patient2);

            // Display details
            hospital.listDepartments();
            System.out.println();
            System.out.println("Doctor and Patient Details:");
            doctor1.listPatients();
            doctor2.listPatients();
            patient1.showDetails();
            patient2.showDetails();


            // Print total counts
            System.out.println("Total Patients: " + Person.getPatientCount());
            System.out.println("Total Doctors: " + Person.getDoctorCount());
            System.out.println("Total Supervisors: " + Person.getSupervisorCount());

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Hospital system test complete.");
        }
    }
}
