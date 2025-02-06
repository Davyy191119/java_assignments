
public class Employee {

    private String _name;
    private double salary;

    
    public Employee(String name, double salary) {
        _name = name;
        _salary = salary;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    
    public double getSalary() {
       return salary;
    }
}
