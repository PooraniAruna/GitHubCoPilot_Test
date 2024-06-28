package Task3;
public class BugExampleOri {
    public static void main(String[] args) { 
    int[] numbers = {1, 2, 3, 4, 5}; 
    int sum = 0; 
    for (int i = 0; i <= numbers.length; i++) { 
    sum += numbers[i]; // Bug: Index out of bounds error 
    } 
    System.out.println("Sum of numbers: " + sum); 
    } 
   }