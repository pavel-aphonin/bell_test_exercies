package Task_2;
import java.util.*;

public class EmployersService {
    private final List<Employer> employers;

    public EmployersService(List<Employer> employers) {
        this.employers = employers;
    }

    public List<String> getYounger(int age) {
        return employers.stream()
                .filter(e -> e.getAge() < age)
                .map(Employer::getName)
                .toList();
    }

    public List<String> getSalaryIn(String currency) {
        return employers.stream()
                .filter(e -> e.getSalary().contains(currency))
                .map(Employer::getName)
                .toList();
    }

    public double getAverageAge() {
        return employers.stream()
                .mapToInt(Employer::getAge)
                .average()
                .orElse(0);
    }
}
