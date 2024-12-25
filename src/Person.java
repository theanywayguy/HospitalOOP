public abstract class Person {
    private String name;
    private final int id;
    private static int patientCount = 0;
    private static int doctorCount = 0;
    private static int supervisorCount = 0;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        if (this instanceof Patient) {
            patientCount++;
        } else if (this instanceof Doctor) {
            doctorCount++;
        } else if (this instanceof Supervisor) {
            supervisorCount++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            this.name = name;
        } catch (IllegalArgumentException e) {
            System.out.println("Error:" + e.getMessage());
        }


    }

    public int getId() {
        return id;
    }

    public abstract void showDetails();

    public static int getPatientCount() {
        return patientCount;
    }

    public static int getDoctorCount() {
        return doctorCount;
    }

    public static int getSupervisorCount() {
        return supervisorCount;
    }

}
