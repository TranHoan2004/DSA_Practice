package Tree_Constructor;

public class Main {
    /**
     * <ul>
     *     <li>
     *         <b>Tree Constructor</b><br>
     *         Have the function TreeConstructor({@code strArr}) take the array of strings
     *         stored in {@code strArr} which will contain pairs of integers in the following
     *         format: (i1,i2), where i1 represents a child node in a tree and the second
     *         integer i2 signifies that it is the parent of i1.
     *     </li>
     *     <li>
     *         For example, if {@code strArr} is ["(1,2)", "(2,4)", "(7,2)"], then this forms the
     *         following tree:<br>
     *         <img src="NMRdSO1.png" alt="Tree Diagram"><br>
     *         which you can see forms a proper binary tree. Your program should, in this
     *         case, return the string true because a valid binary tree can be formed. If
     *         a proper binary tree cannot be formed with the integer pairs, then return
     *         the string false. All the integers within the tree will be unique, which
     *         means there can only be one node in the tree with the given integer value.
     *     </li>
     *     <li>
     *         <b>Examples:</b><br>
     *         {@code
     *         Input: new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}
     *         Output: true
     *         } <br>
     *         {@code
     *         Input: new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"}
     *         Output: false
     *         }
     *     </li>
     * </ul>
     */
    public static void main(String[] args) {
    }

//    public static String TreeConstructor(String[] debai) {
//        // code goes here
//        if (debai.length == 1) {
//            return "true";
//        }
//        int[] parent = new int[10];
//        int[] children = new int[10];
//        for (int i = 0; i < debai.length; i++) {
//            String[] output = getPairs(debai[i]);
//            parent[i] = Integer.parseInt(output[1]);
//            children[i] = Integer.parseInt(output[0]);
//        }
//        Map<Integer, Set<Integer>> map = new HashMap<>();
//        for (int i = 0; i < debai.length; i++) {
//            if (!map.containsKey(parent[i])) {
//                map.put(parent[i], new HashSet<>());
//                map.get(parent[i]).add(children[i]);
//            } else {
//                if (map.get(parent[i]).size() >= 2) {
//                    return ("false");
//                } else {
//                    map.get(parent[i]).add(children[i]);
//                    if (checkValid(map.get(parent[i]), parent[i])) {
//                        return ("false");
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < children.length; i++) {
//            if (map.containsKey(children[i])) {
//                map.remove(children[i]);
//            }
//        }
//        return (map.keySet().size() == 1 ? "true" : "false");
//    }
//
//    private static String[] getPairs(String input) {
//        input = input.substring(1, input.length() - 1);
//        return input.split(",");
//    }
//
//    private static boolean checkValid(Set<Integer> set, int parent) {
//        int[] array = set.stream().mapToInt(i -> i).toArray();
//        return (array[0] > parent && array[1] > parent) || (array[0] < parent && array[1] < parent);
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(TreeConstructor(s.nextLine()));
//    }
}
