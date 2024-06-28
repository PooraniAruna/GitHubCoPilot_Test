package Task3;
//beautify below code snippet
public class BugExample {
    public static void main(String[] args) { 
    int[] numbers = {1, 2, 3, 4, 5}; 
    int sum = 0; 
    // fix index out of bounds error by changing i <= numbers.length to i < numbers.length
    for (int i = 0; i < numbers.length; i++) { 
        sum += numbers[i]; // Bug: Index out of bounds error 
    } 
    System.out.println("Sum of numbers: " + sum); 
    } 
   }