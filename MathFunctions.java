package Task4;
public class MathFunctions {
    // Method to add two numbers 
    
    public static int add(int a, int b) { 
     return a + b; 
    } 
    // Method to subtract two numbers 
    public static int subtract(int a, int b) { 
     return a - b; 
    } 
    // Method to multiply two numbers 
    public static int multiply(int a, int b) { 
     return a * b; 
    } 
    // Method to divide two numbers 
    public static int divide(int a, int b) { 
     if (b == 0) { 
     throw new IllegalArgumentException("Cannot divide by zero"); 
     } 
     return a / b;
    } 
    //write testcases for all functions with boundry conditions and normal conditions
    public static void main(String[] args) {
        //TestCases for add function
        System.out.println(add(1, 2) == 3);
        System.out.println(add(0, 0) == 0);
        System.out.println(add(-1, -2) == -3);
        System.out.println(add(-1, 2) == 1);
        //TestCases for subtract function
        System.out.println(subtract(1, 2) == -1);
        System.out.println(subtract(0, 0) == 0);
        System.out.println(subtract(-1, -2) == 1);
        System.out.println(subtract(-1, 2) == -3);
        //TestCases for multiply function
        System.out.println(multiply(1, 2) == 2);
        System.out.println(multiply(0, 0) == 0);
        System.out.println(multiply(-1, -2) == 2);
        System.out.println(multiply(-1, 2) == -2);
        //TestCases for divide function
        System.out.println(divide(1, 2) == 0);
        System.out.println(divide(0, 0) == 0);
        System.out.println(divide(-1, -2) == 0);
        System.out.println(divide(-1, 2) == 0);
    }
    
    
}