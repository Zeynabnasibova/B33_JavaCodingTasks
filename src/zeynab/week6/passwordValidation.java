package zeynab.week6;


public class passwordValidation {
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

    public static void main(String args[]) {

        System.out.println(isValidPasword("zeynabZ&1" ));
    }

    public static boolean isValidPasword(String password) {
        //String password = "Zeynab123,";

        String lowercase = "(.*[a-z].*)";//A regular expression is a sequence of characters that specifies a search pattern.
        // String lowercase = "abcdefghijklmnopqrstuvwxyz";//I can write like that

        String uppercase = "(.*[A-Z].*)";

        String numbers = "(.*[0-9].*)";

        String specialchars = "(.*[ -/, & :-@].*)";

        if (password.length() >= 6 && !password.contains(" ")) {

        }if (password.matches(lowercase)) {

        }if (password.matches(uppercase)) {

        }if (password.matches(numbers)) {

        }if (password.matches(specialchars)) {

            return true;

        } else {

            return false;
        }
    }
}