package Task_2;
import java.util.*;

public class EmployerMapper {
    public static Employer map(Map<String, String> row) {
        return new Employer(
                row.get("Имя"),
                Integer.parseInt(row.get("Возраст")),
                row.get("Должность"),
                row.get("Зарплата")
        );
    }
}
