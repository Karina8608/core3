import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иван", 2020, 5, 20, 50000);
        employees[1] = new Employee("Петр", 2019, 3, 15, 55000);
        employees[2] = new Manager("Сергей", 2018, 7, 10, 60000);

        // Увеличиваем зарплату на 10%
        double increasePercentage = 10;
        Manager.increaseSalary(employees, increasePercentage);

        // Выводим информацию о зарплатах
        Arrays.stream(employees).forEach(System.out::println);
    }
}