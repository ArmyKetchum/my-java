class Employee {
    int age;
    String name, designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empSalary(double sal) {
        salary = sal;
    }

    public void printEmployee() {
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Designation:" +designation);
        System.out.println("Salary:" +salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empone = new Employee("Ameer");
        Employee emptwo = new Employee("Sunkesula");
        empone.empAge(23);
        empone.empDesignation("S/W dev");
        empone.empSalary(90000.00d);
        empone.printEmployee();
        emptwo.empAge(15);
        emptwo.empDesignation("S/W eng.");
        emptwo.empSalary(50000.00d);
        emptwo.printEmployee();
    }
}