
import java.util.*;

public class EmployeeBook {
    Map<String, Employee> employees = new HashMap<>(Map.of(
            "Иван Иванов",
            new Employee(
                    "Иван",
                    "Иванов",
                    23132,
                    1),
            "Иван1 Иванов1",
            new Employee(
                    "Иван1",
                    "Иванов1",
                    54512,
                    2),
            "Иван2 Иванов2",
            new Employee(
                    "Иван2",
                    "Иванов2",
                    256,
                    3),
            "Иван3 Иванов3",
            new Employee(
                    "Иван3",
                    "Иванов3",
                    34282,
                    1),
            "Иван4 Иванов4",
            new Employee(
                    "Иван4",
                    "Иванов4",
                    33132,
                    2),
            "Иван5 Иванов5",
            new Employee(
                    "Иван5",
                    "Иванов5",
                    23542,
                    3),
            "Иван6 Иванов6",
            new Employee(
                    "Иван6",
                    "Иванов6",
                    43132,
                    1)
    ));

    public void addEmployee(String employeeName, String employeeSureName, int employeeSalary, int employeeDepartment) {
        if (employees.containsKey(employeeName + " " + employeeSureName)) {
            throw new RuntimeException("такой уже есть");
        } else {
            employees.put(
                    employeeName + " " + employeeSureName,
                    new Employee(
                            employeeName,
                            employeeSureName,
                            employeeSalary,
                            employeeDepartment));
        }
    }

    public void removeEmployee(String name, String sureName) {
        if (!employees.containsKey(name + " " + sureName)) {
            throw new RuntimeException("нет такого сотрудника");
        } else {
            employees.remove(name + " " + sureName);
        }
    }

    public Employee findEmployee(String name, String sureName) {
        if (!employees.containsKey(name + " " + sureName)) {
            throw new RuntimeException("нет такого сотрудника");
        } else {
            return employees.get(name + " " + sureName);
        }
    }

    public void changeEmployeeSalary(Employee findEmployee, int newSalary) {
        findEmployee.setSalary(newSalary);
    }

    public void changeEmployeeDepartment(Employee findEmployee, int newDepartment) {
        findEmployee.setDepartment(newDepartment);
    }

    public void printEmployeesByDepartment(int numberDepartment) {
        System.out.println("В " + numberDepartment + " отделе состоят сотрудники: ");
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == numberDepartment) {
                System.out.println(employee);
            }
        }
    }


    public void printInfoEmployee() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
        System.out.println();
    }

    public void printFullNameEmployee() {
        for (Employee employee : employees.values()) {
            System.out.println(employee.getFullName());
        }
        System.out.println();
    }

    public double getAllSalary() {
        int allSalary = 0;
        for (Employee employee : employees.values()) {
            allSalary += employee.getSalary();
        }
        return allSalary;
    }

    public Employee getEmployeeMinSalary() {
        List<Employee> employeeList = new ArrayList<>(employees.values());
        Collections.sort(employeeList);
        return employeeList.get(0);
    }

    public Employee getEmployeeMaxSalary() {
        List<Employee> employeeList = new ArrayList<>(employees.values());
        Collections.sort(employeeList);
        return employeeList.get(employeeList.size() - 1);
    }


    public double getAverageSalary() {
        double average = getAllSalary() / employees.size();
        return Math.round(average * 100) / 100.0d;
    }
}
