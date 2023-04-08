public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов1 Иван1 Иванович1", 33333, 1);
        employeeBook.addEmployee("Иванов2 Иван2 Иванович2", 40234, 2);
        employeeBook.addEmployee("Иванов3 Иван3 Иванович3", 45234, 3);
        employeeBook.addEmployee("Иванов4 Иван4 Иванович4", 25345, 1);
        employeeBook.addEmployee("Иванов5 Иван5 Иванович5", 35345, 2);
        employeeBook.addEmployee("Иванов6 Иван6 Иванович6", 49292, 3);
        employeeBook.addEmployee("Иванов7 Иван7 Иванович7", 39423, 1);
        employeeBook.addEmployee("Иванов8 Иван8 Иванович8", 37295, 2);
        employeeBook.addEmployee("Иванов9 Иван9 Иванович9", 42853, 3);
        employeeBook.addEmployee("Иванов10 Иван10 Иванович10", 32423, 4);
        employeeBook.printInfoEmployee();
        employeeBook.printFullNameEmployee();
        double allSalary = employeeBook.getAllSalary();
        System.out.println("Зарплата всех сотрудников " + allSalary);
        System.out.println("Сотрудник с минимальной зарплатой " + employeeBook.getEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + employeeBook.getEmployeeMaxSalary());
        double averageSalary = employeeBook.getAverageSalary();
        System.out.printf("Средняя зарплата %.2f\n", averageSalary);
        employeeBook.removeEmployee("Иванов2 Иван2 Иванович", 2);
        employeeBook.printFullNameEmployee();
        employeeBook.changeEmployeeSalary(employeeBook.findeEmployee("Иванов3 Иван3 Иванович"),20000);
        employeeBook.changeEmployeeDepartment(employeeBook.findeEmployee("Иванов3 Иван3 Иванович"), 1);
        employeeBook.printInfoEmployee();
        employeeBook.printEmployeesByDepartment(2);
        employeeBook.printAllEmployeeDepartment();

    }
}