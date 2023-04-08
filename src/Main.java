public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.printInfoEmployee();
        employeeBook.addEmployee("Иван10", "Иванов10", 31312, 3);
        employeeBook.printFullNameEmployee();
        employeeBook.removeEmployee("Иван10", "Иванов10");
        System.out.println(employeeBook.findEmployee("Иван", "Иванов"));
        employeeBook.changeEmployeeSalary(employeeBook.findEmployee("Иван", "Иванов"), 11111);
        employeeBook.printEmployeesByDepartment(1);
        employeeBook.changeEmployeeDepartment(employeeBook.findEmployee("Иван", "Иванов"), 3);
        System.out.println(employeeBook.getAllSalary());
        System.out.println(employeeBook.getAverageSalary());
        System.out.println(employeeBook.getEmployeeMaxSalary());
        System.out.println(employeeBook.getEmployeeMinSalary());

    }
}