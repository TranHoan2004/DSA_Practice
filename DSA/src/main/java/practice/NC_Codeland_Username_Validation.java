package practice;

public class NC_Codeland_Username_Validation {
    /**
     * <ul>
     *     <li>
     *         <b>Codeland Username Validation</b><br>
     *         Have the function CodelandUsernameValidation({@code str}) take the {@code str} parameter
     *         being passed and return 1 determine if the string is a valid username according to the
     *         following rules:<br>
     *         1. The username is between 4 and 25 characters.<br>
     *         2. It must start with a letter.<br>
     *         3. It can only contain letters, numbers, and the underscore character.<br>
     *         4. It cannot end with an underscore character.<br>
     *         If the username is valid then your program should return the string true,
     *         otherwise return the string false.
     *     </li>
     *     <li>
     *         <b>Examples:</b><br>
     *         {@code
     *         Input: "aa_"
     *         Output: false
     *         } <br>
     *         {@code
     *         Input: "u__hello_world123"
     *         Output: true
     *         }
     *     </li>
     * </ul>
     */
    public static void main(String[] args) {
    }

//    public static String CodelandUsernameValidation(String str) {
//        // code goes here
//        return isValidLength(str) && isStartWithCharacter(str) && isFormattedString(str) ? "true" : "false";
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(CodelandUsernameValidation(s.nextLine()));
//    }
//
//    public static boolean isValidLength(String str) {
//        return str.length() >= 4 && str.length() <= 25;
//    }
//
//    public static boolean isStartWithCharacter(String str) {
//        return Character.isAlphabetic(str.charAt(0));
//    }
//
//    public static boolean isFormattedString(String str) {
//        return str.matches("^[A-Za-z0-9_]+$") && str.charAt(str.length() - 1) != '_';
//    }
}
