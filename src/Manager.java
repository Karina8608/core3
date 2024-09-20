import java.time.LocalDate;
import java.util.Arrays;

class Manager extends Employee {
    public Manager(String name, int year, int month, int day, double salary) {
        super(name, year, month, day, salary);
    }

    @Override
    public LocalDate getHireDate() {
        return super.getHireDate();
    }

    @Override
    public int compareHireDate(Employee other) {
        return super.compareHireDate(other);
    }

    // Метод для увеличения зарплаты всем, кроме менеджеров
    public static void increaseSalary(Employee[] employees, double percentage) {
        Arrays.stream(employees)
                .filter(employee -> !(employee instanceof Manager))
                .forEach(employee -> {
                    double newSalary = employee.getSalary() * (1 + percentage / 100);
                    employee.setSalary(newSalary);
                });
    }
}

