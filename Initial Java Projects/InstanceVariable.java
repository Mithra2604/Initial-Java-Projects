public class InstanceVariable
 {
    // Instance variables
    private int num1;
    private int num2;
    
    // Constructor
    public MyClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Method to set num1
    public void setNum1(int num) {
        this.num1 = num;
    }
    
    // Method to set num2
    public void setNum2(int num) {
        this.num2 = num;
    }
    
    // Method to get the sum of num1 and num2
    public int getSum() {
        return num1 + num2;
    }
    
    // Method to display num1 and num2
    public void displayNumbers() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
    
    // Method to demonstrate scope
    public void scopeDemo() {
        int localVar = 100; // Local variable
        
        // Accessing instance variables within the method
        System.out.println("Within scopeDemo method:");
        System.out.println("num1: " + num1); // Accessing instance variable
        System.out.println("num2: " + num2); // Accessing instance variable
        
        // Accessing local variable
        System.out.println("localVar: " + localVar);
    }
    
    public static void main(String[] args) {
        MyClass myObj = new MyClass(5, 10);
        
        // Calling methods
        myObj.displayNumbers(); // Displaying initial values
        
        myObj.setNum1(20); // Setting num1
        myObj.setNum2(30); // Setting num2
        
        myObj.displayNumbers(); // Displaying updated values
        
        System.out.println("Sum: " + myObj.getSum()); // Getting sum
        
        myObj.scopeDemo(); // Demonstrating scope within method
    }
}