package PalwashayKhan.week6;

public class PasswordValidation {
 /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/

    public static void main(String[] args) {
        System.out.println(PasswordValidation("Ab*1Ab"));
        System.out.println(PasswordValidation("Ab*1A"));

        System.out.println(PasswordValidation2("Ab*1Ab"));
        System.out.println(PasswordValidation2("Ab*1A"));

        System.out.println(PasswordValidation3("Ab*1Ab"));
        System.out.println(PasswordValidation3("Ab*1A"));

        System.out.println(PasswordValidation4("Ab*1Ab"));
        System.out.println(PasswordValidation4("Ab1Acb"));


    }

    public static boolean PasswordValidation(String password) {

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                isValid = false;

        if (password.length() >= 6 && !password.contains(" "))
            if (HasLower && HasUpper && HasDigits && HasSpecial)
                isValid = true;
        return isValid;
    }

    public static boolean PasswordValidation2(String password) {
        if ((password.length() < 6) || (password.contains(" ")) || (!password.matches(".*[A-Z].*")) || (!password.matches(".*[a-z].*")) || (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) || (!password.matches(".*\\d.*"))) {
            return false;
        }
        return true; // if all requirements are met
    }

    public static boolean PasswordValidation3(String password) {

        //More readable version of the solution would be like below.
        // Check if password length is at least 6 characters
        if (password.length() < 6) {
            return false;
        }

        // Check if password contains any whitespace characters
        if (password.contains(" ")) {
            return false;
        }

        // Check if password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check if password contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check if password contains at least one special character
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false;
        }

        // Check if password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // If all requirements are met, return true
        return true;
    }


    public static boolean PasswordValidation4(String password) {
        // Check if password length is at least 6 characters
        if (password.length() < 6) {
            return false;
        }

        // Check if password contains any whitespace characters
        for (char c : password.toCharArray()) {
            if (Character.isWhitespace(c)) {
                return false;
            }
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        // Iterate over each character in the password to check for uppercase, lowercase, and digits
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                // If the character is not a letter or digit, it must be a special character
                // Set a flag indicating that a special character is found
                hasSpecialCharacter = true;
            }
        }

        // Check if all required criteria are met
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;
    }

}

