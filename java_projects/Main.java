
/**
>This is a simple program that does the following:
            *calculates the bonus awarded to employees
            based on the number of years they have 
            been working for


@author:DAVID MUCHIRI 
ADM :CT101/G/19119/23.
CS Y2 S2
@VERSION 1.0.1
DATE : 1/19/2025
6:40 PM
*/
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        
        

         System.out.print("Enter employee's salary: ");
         double salary = scanner.nextDouble();
        
         System.out.print("Enter years of service: ");
         int yearsOfService = scanner.nextInt();
        
      
         double bonusPercentage;
        
        if (yearsOfService > 10) {
            bonusPercentage = 0.12; 
            
        } 
        else if (yearsOfService >= 6) {
            bonusPercentage = 0.10;  
        } 
        else {
            bonusPercentage = 0.05;  
        }
        
       
        double bonusAmount = salary * bonusPercentage;
        
        
        System.out.printf("Years of service: %d years%n", yearsOfService);
        System.out.printf("Bonus percentage: %.2f%%%n", bonusPercentage * 100);
        System.out.printf("Bonus amount: kshs%f%n", bonusAmount);
        
        scanner.close();
    }
}