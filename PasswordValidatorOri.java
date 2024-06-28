package Task2;
//improve code 
public class PasswordValidatorOri {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        for (char c: password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasNumber;
    }
    public static void main(String[] args) {
        String password = "veryStrongP@ss";
        boolean valid = isValidPassword(password);
        System.out.println("Password is valid: " + valid);
    }
}