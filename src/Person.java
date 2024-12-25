public abstract class Person {
    private String name;
    private final int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
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


}
