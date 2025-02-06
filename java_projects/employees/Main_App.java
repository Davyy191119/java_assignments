/**this codeis meant to to calculate an employees' salary 
 * @author David muchiri
 * @Date :2/4/2025
 * 8:26pm 
 * @version 1.0.1
  */
import java.util.Scanner;


public class Main_App {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
       
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        
        Employee e1 = new Employee(name, salary);
        e1.displayDetails();

        
        SalaryCalculator s1 = new SalaryCalculator();
        
        
        s1.calculateBonus(e1.getSalary());

        // Displaying bonus
        s1.displayBonus();

        input.close();
    }
}
