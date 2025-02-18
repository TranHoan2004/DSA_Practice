package practice;

public class NC_Find_Intersection {
    /**
     * <ul>
     *     <li>
     *         <b>Find Intersection</b><br>
     *         Have the function FindIntersection({@code strArr}) read the array of strings stored in
     *         {@code strArr} which will contain 2 elements: the first element will represent a list of comma-separated
     *         numbers sorted in ascending order, the second element will represent a second list of comma-separated
     *         numbers (also sorted). Your goal is to return a comma-separated string containing the numbers
     *         that occur in elements of {@code strArr} in sorted order. If there is no intersection, return the string false.
     *     </li>
     *     <li>
     *         <b>Examples:</b><br>
     *         {@code
     *         Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
     *         Output: 1,4,13
     *         } <br>
     *         {@code
     *         Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
     *         Output: 1,9,10
     *         }
     *     </li>
     * </ul>
     */
    public static void main(String[] args) {
    }

//    public static String FindIntersection(String[] strArr) {
//        // code goes here
//        String[] firstString = strArr[0].replaceAll("[\\s]", "").split(","); // 1, 3, 4, 7, 13
//        String[] secondString = strArr[1].replaceAll("[\\s]", "").split(","); // 1, 2, 4, 13, 15
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < firstString.length; i++) {
//            for (int j = 0; j < secondString.length; j++) {
//                if (firstString[i].equals(secondString[j]) && !list.contains(firstString[i])) {
//                    list.add(firstString[i]);
//                }
//            }
//        }
//        if (list.isEmpty()) {
//            return "false";
//        }
//        StringBuilder str = new StringBuilder();
//        for (String s : list) {
//            if (list.indexOf(s) == (list.size() - 1)) {
//                str.append(s);
//            } else {
//                str.append(s).append(",");
//            }
//        }
//        return str.toString();
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(FindIntersection(s.nextLine()));
//    }
}
