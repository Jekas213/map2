import java.sql.SQLOutput;

public class EmployeeBook {
    private Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String employeeName, int employeeSalary, int employeeDepartment) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, все места занятяты");
        }
        Employee newEmployee = new Employee(employeeName, employeeSalary, employeeDepartment);
        employees[size++] = newEmployee;
    }

    public void removeEmployee(String fullName, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName) || employees[i].getId() == id) {
                System.out.println(employees[i].getFullName() + " удалён");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public Employee findeEmployee(String fullName) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                index = i;
            }
        }
        return employees[index];
    }

    public Employee changeEmployeeSalary(Employee findeEmployee, int newSalary) {
        findeEmployee.setSalary(newSalary);
        return findeEmployee;
    }

    public Employee changeEmployeeDepartment(Employee findeEmployee, int newDepartment) {
        findeEmployee.setDepartment(newDepartment);
        return findeEmployee;
    }

    public void printEmployeesByDepartment(int numberDepartment) {
        System.out.println("В " + numberDepartment + " отделе состоят сотрудники: ");
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == numberDepartment) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public int getMinNumberDepartment() {
        int min = employees[0].getDepartment();
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() < min) {
                min = employees[i].getDepartment();
            }
        }
        return min;
    }

    public int getMaxNumberDepartment(){
        int max = employees[0].getDepartment();
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() > max) {
                max = employees[i].getDepartment();
            }
        }
        return max;
    }

    public void printAllEmployeeDepartment() {
        for (int numberDepartment = getMinNumberDepartment(); numberDepartment <= getMaxNumberDepartment(); numberDepartment++) {
            System.out.printf("В %d департаменте находятся сотрудники:\n", numberDepartment);
            for (int i = 0; i < size; i++) {
                if (employees[i].getDepartment() == numberDepartment) {
                    System.out.println(employees[i].getFullName());
                }
            }
        }
    }


    public void printInfoEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void printFullNameEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public double getAllSalary() {
        int allSalary = 0;
        for (int i = 0; i < size; i++) {
            allSalary += employees[i].getSalary();
        }
        return allSalary;
    }

    public Employee getEmployeeMinSalary() {
        int min = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
            if (min == employees[i].getSalary()) {
                index = i;
            }
        }
        return employees[index];
    }

    public Employee getEmployeeMaxSalary() {
        int max = employees[0].getSalary();
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
            if (max == employees[i].getSalary()) {
                index = i;
            }
        }
        return employees[index];
    }

    public double getAverageSalary() {
        double average = getAllSalary() / size;
        return average;
    }

}
