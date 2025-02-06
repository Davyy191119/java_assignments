public class Student{
    //methods
    private String _name;
    private double _marks; 
    //constructor for student class
    public Student(String name, double marks){
        _name = name;
        _marks = marks;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    
    public double getMarks(){
        return marks;
    }
}