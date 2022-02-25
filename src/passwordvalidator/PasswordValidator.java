package passwordvalidator;

/**
 *
 * @author Kubra Bas
 */
public class PasswordValidator {

    /**
     * @param args 
     * main method calls two methods to display if the password contains 
     * at least uppercase letter and contains at least one special character. 
     */
    public static void main(String[] args) {

        System.out.println("Does password Contain any upper case letter? "
                + (isContainUpperCase("Hello123*")));

        System.out.println("Does password Contain any special character? "
                + (isContainSpecialChar("Hello123*")));

    }

    /**
     * To test a password's length
     *
     * @param password the password to test
     * @return true if length >=8
     */
    public static boolean isValidLength(String password) {
        return (password.length() >= 8);
    }

    /**
     * To test a password if it contains at least one Uppercase character
     *
     * @param password the password to test
     * @return true if contains an Uppercase char
     */
    public static boolean isContainUpperCase(String password) {

        boolean isContain = false;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))) {

                isContain = true;
                break;
            }
        }
        return isContain;
    }
    
/**
     * To test a password if it contains at least one special character
     *
     * @param password the password to test
     * @return true if contains a (*#@%_+...) character.
     */
    public static boolean isContainSpecialChar(String password) {

        boolean isConSpecial = false;

        for (int i = 0; i < password.length(); i++) {

            if (!(Character.isLetter(password.charAt(i)))
                    && (!(Character.isDigit(password.charAt(i))))) {

                isConSpecial = true;
                break;

            }
        }
        return isConSpecial;
    }

}
