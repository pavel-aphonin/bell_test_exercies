package Task_2;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, String>> table = List.of(
                Map.of(
                        "Имя", "Кирилл",
                        "Возраст", "26",
                        "Должность", "Middle java dev",
                        "Зарплата", "150000 руб"
                ),
                Map.of(
                        "Имя", "Виталий",
                        "Возраст", "28",
                        "Должность", "Senior java automation QA",
                        "Зарплата", "2000$"
                ),
                Map.of(
                        "Имя", "Александр",
                        "Возраст", "31",
                        "Должность", "junior functional tester",
                        "Зарплата", "50000 руб"
                ),
                Map.of(
                        "Имя", "Дементий",
                        "Возраст", "35",
                        "Должность", "dev-ops",
                        "Зарплата", "1500$"
                )
        );

        List<Employer> employers = table.stream()
                .map(row -> new Employer(
                        row.get("Имя"),
                        Integer.parseInt(row.get("Возраст")),
                        row.get("Должность"),
                        row.get("Зарплата")
                ))
                .toList();

        EmployersService service = new EmployersService(employers);

        System.out.println("Младше 30: "+service.getYounger(30));
        System.out.println("В рублях: "+service.getSalaryIn("руб"));
        System.out.println("Средний возраст: "+service.getAverageAge());
    }
}
