package practice;

public class NC_Question_Marks {
    /**
     * <ul>
     *     <li>
     *         <b>Questions Marks</b><br>
     *         Have the function QuestionsMarks({@code str}) take the {@code str} string parameter, which will contain
     *         single digit numbers, letters, and question
     *         marks, and check if there are exactly 3 question
     *         marks between every pair of two numbers that
     *         add up to 10. If so, then your program should
     *         return the string true, otherwise it should return
     *         the string false. If there aren't any two numbers
     *         that add up to 10 in the string, then your
     *         program should return false as well.
     *     </li>
     *     <li>
     *         For example: if {@code str} is "arrb6???4xxbl5???eee5" then your program should
     *         return true because there are exactly 3 question marks between 6
     *         and 4, and 3 question marks between 5 and 5 at the end of the string.
     *     </li>
     *     <li>
     *         <b>Examples:</b><br>
     *         {@code
     *         Input: "aa6?9"
     *         Output: false
     *         } <br>
     *         {@code
     *         Input: "acc?7??sss?3rr1??????5"
     *         Output: true
     *         }
     *     </li>
     * </ul>
     */
    public static void main(String[] args) {
    }

//    public static String QuestionsMarks(String str) {
//        int i = 0;
//        while (i < str.length()) {
//            if (Character.isDigit(str.charAt(i))) {
//                int j = i + 1;
//                int count = 0;
//                while (j < str.length()) {
//                    if (str.charAt(j) == '?') {
//                        count++;
//                    }
//                    if (Character.isDigit(str.charAt(j))) {
//                        if (Integer.parseInt(str.charAt(i) + "") + Integer.parseInt(str.charAt(j) + "") == 10 && count == 3) {
//                            return "true";
//                        } else {
//                            i = j;
//                            break;
//                        }
//                    }
//                    j++;
//                }
//            }
//            i++;
//        }
//        return "false";
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(QuestionsMarks(s.nextLine()));
//    }
}
