package entities;

public class Department {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
