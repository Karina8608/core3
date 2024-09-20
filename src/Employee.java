import java.time.LocalDate;

class Employee {
    private String name;
    private LocalDate hireDate;
    private double salary;

    public Employee(String name, int year, int month, int day, double salary) {
        this.name = name;
        this.hireDate = LocalDate.of(year, month, day);
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Метод для сравнения дат без условного оператора
    public int compareHireDate(Employee other) {
        return this.hireDate.compareTo(other.hireDate);
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', hireDate=%s, salary=%.2f}", name, hireDate, salary);
    }
}
