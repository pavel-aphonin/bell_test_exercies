package Task_2;

public class Employer {
    private final String name;
    private final int age;
    private final String position;
    private final String salary;

    public Employer(String name, int age, String position, String salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }
}
