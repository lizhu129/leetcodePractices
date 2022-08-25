package PalindromeNumber;

// Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.
//For example, 121 is a palindrome while 123 is not.

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        char[] digits = number.toCharArray();
        for (int i = 0; i < digits.length/2; i++) {
            if (digits[i] == digits[digits.length - 1 - i]) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
