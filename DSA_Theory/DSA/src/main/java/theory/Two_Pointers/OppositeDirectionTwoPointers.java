package Two_Pointers;

public class OppositeDirectionTwoPointers {
    /**
     * <ul>
     *     <li>
     *         <b>Kỹ thuật con trỏ đối xứng</b> (Opposite Direction Two Pointers) sử dụng 2 con trỏ chốt 2 đầu của mảng, sau đó cho nó di chuyển về giữa.
     *         Dùng để kiểm tra 1 cặp phần tử thỏa mãn điều kiện nào đó
     *     </li>
     *     <li>
     *         <b>Palindrome</b> là 1 chuỗi mà khi đảo ngược (không quan tâm khoảng trắng, dấu câu,...) thì vẫn không đổi.<br>
     *         Khi kiểm tra 1 chuỗi có phải Palindrome hay không, ta chỉ cần so sánh nó với chuỗi đảo ngược là xong.
     *     </li>
     * </ul>
     */
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "A man, a plan, a canal, Panama";
        String s3 = "agsdfhjjqwaxckzl";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }


    private static boolean isPalindrome(String input) {
        input = removeAllUnnecessaryCharacters(input).toLowerCase();
        int left = 0, right = input.length() - 1;
        String[] str = input.split("");
        while (left < right) {
            if (!str[left].equals(str[right])) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static String removeAllUnnecessaryCharacters(String input) {
        char[] str = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : str) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
