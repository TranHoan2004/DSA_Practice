package Longest_Word;

public class Main {
    /**
     * <ul>
     *     <li>
     *         <b>Longest Word</b><br>
     *         Have the function LongestWord({@code sen}) take the {@code sen} parameter
     *         being passed and return the longest word in the string. If there
     *         are two or more words that are the same length, return the first
     *         word from the string with that length. Ignore punctuation and
     *         assume {@code sen} will not be empty. Words may also contain
     *         numbers.
     *     </li>
     *     <li>
     *         For example: "Hello world123 567"
     *     </li>
     *     <li>
     *         <b>Examples:</b><br>
     *         {@code
     *         Input: "fun&!! time"
     *         Output: time
     *         } <br>
     *         {@code
     *         Input: "I love dogs"
     *         Output: love
     *         }
     *     </li>
     * </ul>
     */
    public static void main(String[] args) {
    }

//    public static String LongestWord(String sen) {
//        // code goes here
//        return getStringWithMaxLength(sen);
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(LongestWord(s.nextLine()));
//    }
//
//    public static String getStringWithMaxLength(String string) {
//        String longText = null;
//        if (!string.trim().isEmpty()) {
//            String[] text = string.split("\\s+");
//            if (!isValidFormat(text[0])) {
//                text[0] = getStringWithoutPunctuation(text[0]);
//            }
//            int max = text[0].length();
//            for (int i = 0; i < text.length; i++) {
//                if (!isValidFormat(text[i])) {
//                    text[i] = getStringWithoutPunctuation(text[i]);
//                }
//                if (text[i].length() >= max) {
//                    max = text[i].length();
//                    longText = text[i];
//                }
//            }
//            for (String s : text) {
//                if (max == s.length()) {
//                    longText = s;
//                    break;
//                }
//            }
//        }
//        return longText;
//    }
//
//    public static boolean isValidFormat(String string) {
//        return string.matches("^[A-Za-z0-9]+$");
//    }
//
//    public static String getStringWithoutPunctuation(String string) {
//        String result = "";
//        String[] text = string.split("");
//        for (String str: text) {
//            if (str.matches("[A-Za-z0-9]")) {
//                result += str;
//            }
//        }
//        return result;
//    }
}
