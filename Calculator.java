package Task5;

public class Calculator { 
    // Method to add two numbers
     
     /**
     * @param a: int, the first number to be added
     * @param b: int, the second number to be added
     * @return int, the sum of a and b
     */
     public static int add(int a, int b) {
     return a + b;
     } 
     // Method to subtract two numbers
     /**
     * @param a: int, the number to be subtracted from
     * @param b: int, the number to subtract
     * @return int, the difference of a and b
     */
     public static int subtract(int a, int b) {
     return a - b;
     } 
     // Method to multiply two numbers
     /**
     * @param a: int, the first number to be multiplied
     * @param b: int, the second number to be multiplied
     * @return int, the product of a and b
     */
     public static int multiply(int a, int b) {
     return a * b;
     } 
     // Method to divide two numbers
     /**
     * @param a: int, the number to be divided
     * @param b: int, the number to divide by
     * @return int, the quotient of a and b
     * @throws IllegalArgumentException if b is zero
     */
     public static int divide(int a, int b) {
     if (b == 0) {
     throw new IllegalArgumentException("Cannot divide by zero");
     }
     return a / b;
     }

     // write testcases for all functions with boundry conditions and normal conditions and exception conditions
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
         //TestCases for divide function exception
         try {
             divide(1, 0);
         } catch (IllegalArgumentException e) {
             System.out.println("Cannot divide by zero");
         }
     }
}