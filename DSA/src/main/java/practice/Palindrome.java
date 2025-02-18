package practice;

public class Palindrome {
    /**
     * <b>Palindrome</b> is the string that when we reserve it (do not care about
     * special characters), it will not be changed.
     */
    private static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int temp = 0;
        while (x > temp) {
            int digit = x % 10;
            temp = temp * 10 + digit;
            x /= 10;
        }
        return temp == x || (temp / 10 == x);
    }

    // In fact, we also use two pointers, but it will take more time than above
    // method.
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
