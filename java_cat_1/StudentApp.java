import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner student = new student(System.in);
        System.out.print("Enter Student Name: ");
        String name = student.nextLine();
        System.out.print("Enter Course: ");
        String course = student.nextLine();
        System.out.print("Enter Student ID: ");
        String studentID = student.nextLine();
        
    
        StudentRecord studente= new StudentRecord(studentID, name, course);
        
    
        student.displayInfo();student.close();
    }
}