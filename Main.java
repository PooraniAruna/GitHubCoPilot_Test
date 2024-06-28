package Task1;
public class Main { 
    public static void main(String[] args) { 
     // Define an array of numbers 
     int[] numbers = {9, 13, 7, 40, 5}; 
     
     // Iterate over the array and print each number 
     for (int i = 0; i < numbers.length; i++) { 
        System.out.println(numbers[i]); 
     } 
     //Summing up all the numbers in the array
     int sum = 0;
     for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
     }
     System.out.println("The sum of the numbers in the array is: " + sum);
     //Finding the maximum number in the array
     int max = numbers[0];
     for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
     }
     System.out.println("The maximum number in the array is: " + max);
     //Finding the minimum number in the array
     int min = numbers[0];
     for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
     }
     System.out.println("The minimum number in the array is: " + min);

     //Sorting the array in ascending or descending order
     int temp = 0;
     for (int i = 0; i < numbers.length; i++) {
        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[i] > numbers[j]) {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
     }
     //Printing the sorted array in ascending order
     System.out.println("The array in ascending order is: ");
     for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
     }
     //Printing the sorted array in descending order
     System.out.println("The array in descending order is: ");
     for (int i = numbers.length - 1; i >= 0; i--) {
        System.out.println(numbers[i]);
     }
     //Generating a new array with squared values of the original numbers array
     int[] squaredArray = new int[numbers.length];
     for (int i = 0; i < numbers.length; i++) {
        squaredArray[i] = numbers[i] * numbers[i];
     }
     //Printing the squared array
     System.out.println("The squared array is: ");
     for (int i = 0; i < squaredArray.length; i++) {
        System.out.println(squaredArray[i]);
     }
     //Filtering the array to only include even or odd numbers
     int[] evenArray = new int[numbers.length];
     int[] oddArray = new int[numbers.length];
     int evenIndex = 0;
     int oddIndex = 0;
     for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 == 0) {
            evenArray[evenIndex] = numbers[i];
            evenIndex++;
        } else {
            oddArray[oddIndex] = numbers[i];
            oddIndex++;
        }
     }
     //Printing the array with even numbers
     System.out.println("The array with even numbers is: ");
     for (int i = 0; i < evenIndex; i++) {
        System.out.println(evenArray[i]);
     }
     //Printing the array with odd numbers
     System.out.println("The array with odd numbers is: ");
     for (int i = 0; i < oddIndex; i++) {
        System.out.println(oddArray[i]);
     }
         
    } 

  }