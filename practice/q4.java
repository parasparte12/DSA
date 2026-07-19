import java.util.*;

public class q4 {

    public static List<String> validatePassword(String pw) { // here List<String> is used to return multiple error messages instead of just one and ValidatePassword is a more descriptive name than validate, which could be used for other types of validation as well.
        List<String> errors = new ArrayList<>();// Use ArrayList for dynamic sizing and easy addition of error messages

        // 1. Handle edge case for null or check length immediately
        if (pw == null || pw.length() < 8) {
            errors.add("Too short");
        }

        if (pw == null) {
            errors.add("Missing uppercase");
            errors.add("Missing digit");
            errors.add("Missing special char");
            return errors;
        }

        // Track conditions using boolean flags
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // 2. Single pass optimization: O(n) time, O(1) space
        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        // 3. Accumulate all failures instead of returning early
        if (!hasUpper) errors.add("Missing uppercase");
        if (!hasDigit) errors.add("Missing digit");
        if (!hasSpecial) errors.add("Missing special char");

        return errors;
    }

    public static void main(String args[]) {
        // Test Case 1: Valid Password
        String pass1 = "Password123!";
        List<String> result1 = validatePassword(pass1);
        System.out.println("Testing '" + pass1 + "': " + (result1.isEmpty() ? "Valid!" : result1));

        // Test Case 2: Failing multiple rules (Too short, no digit, no special char)
        String pass2 = "Hello";
        List<String> result2 = validatePassword(pass2);
        System.out.println("Testing '" + pass2 + "': " + result2);
    }
}