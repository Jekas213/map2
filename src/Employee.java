import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private String sureName;
    private int salary;
    private int department;
    private static int ids = 0;
    private int id;

    public Employee(String name, String sureName, int salary, int department) {
        this.name = name;
        this.sureName = sureName;
        this.salary = salary;
        this.department = department;
        id = ids++;

    }

    public String getFullName() {
        return name + " " + sureName;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ФИО: " + getFullName() + ", зарплата: " + salary + ", департамент: " + department + ", id: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(department);
    }

    @Override
    public int compareTo(Employee employee) {
        return salary - employee.getSalary();
    }
}
