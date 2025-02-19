package practice.string;

import java.util.Arrays;

/**
 * <img src="roman_to_integer.png" alt=""><br/>
 * <img src="roman_to_integer1.png" alt="">
 */
public class RomanToInteger {
    public static int romanToInt(String s) {
        int[] a = new int[s.length()];
        int sum = 0;
        String[] strings = s.split("");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (strings[i].toUpperCase()) {
                case "I":
                    a[i] = 1;
                    break;
                case "V":
                    a[i] = 5;
                    break;
                case "X":
                    a[i] = 10;
                    break;
                case "L":
                    a[i] = 50;
                    break;
                case "C":
                    a[i] = 100;
                    break;
                case "D":
                    a[i] = 500;
                    break;
                case "M":
                    a[i] = 1000;
                    break;
            }
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("==========");
            if (a[i] >= a[i + 1]) {
                System.out.println(sum + "+" + a[i] + "=" + (a[i] + sum));
                sum += a[i];
            } else if (a[i] < a[i + 1]) {
                System.out.println(sum + "-" + a[i] + "=" + (sum - a[i]));
                sum -= a[i];
            }
        }
        return sum + a[s.length() - 1];
    }

    public static void main(String[] args) {
//        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("III"));
    }
}
