package  Task2;

//write code to improve the code quality of the original code
//you can add more methods or classes if necessary
//you can modify the existing methods
//you can add comments
public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        //check password length
        if (password.length() < 8) {
            return false;
        }
        //initialize boolean variables
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        //iterate through the password characters
        for (char c: password.toCharArray()) {
            //check if character is uppercase
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                //check if character is lowercase
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                //check if character is a digit
                hasNumber = true;
            }
        }
        //return true only if password has at least one uppercase, one lowercase, and one digit
        return hasUpperCase && hasLowerCase && hasNumber;
    }
    public static void main(String[] args) {
        //test case
        String password = "veryStrongP@ss"; //veryStr0ngP@ss
        boolean valid = isValidPassword(password);
        System.out.println("Password is valid: " + valid);
    }
}
// The code quality has been improved by adding comments for better understanding of the code logic and structure. The code functionality remains the same.