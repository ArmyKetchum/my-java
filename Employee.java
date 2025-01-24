public class Employee{
    int age;
    String name, designation;
    double salary;
    public Employee(String name){
    this.name=name;
    }
    public void empAge(int empAge){
    age=empAge;
    }
    public void empDesignation(String empDesig){
    designation=empDesig;
    }
    public void empSalary(double sal){
    salary=sal;
    }
    public void printEmployee(){
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Designation:"+designation);
    System.out.println("Salary:"+salary);
    }
    }