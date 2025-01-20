
/**
*program adds two number which the user inputs

@author:DAVID MUCHIRI 
ADM :CT101/G/19119/23.
CS Y2 S2
@VERSION 1.0.1
 @DATE : 1/21 /2025
1: 48 am
*/
import java.util.Scanner ;


public  class add_numbers {
    public static void main (String[] args)
{
    int  num1,num2,sum;
    Scanner scanner=new Scanner (System.in);


    System.out.println("Enter the value of num1:");
    num1= scanner.nextInt();
     
     System.out.println("enter the value of num2:");
     num2 =scanner.nextInt();
    

    sum=num1+num2;
    System.out . println(sum);
      

      scanner.close();


}
}