package isHappy;

public class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumHappy(slow);
            fast = sumHappy(sumHappy(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int sumHappy(int n) {
        int h = 0;
        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            h += a * a;
        }
        return h;
    }

    public static void main(String[] args) {
        int n = 19;
        int a = n;
        while (a > 0) {
            int b = a % 10;
            System.out.println(b);
            a = a / 10;
        }
    }
}
