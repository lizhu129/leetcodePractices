package myPow;

public class Solution {
    public double myPow(double x, int n) {
        if (n > 0) {
            return myPowPos(x, n);
        }
        return 1 / myPowPos(x, -n);

    }

    private double myPowPos(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double temp = myPowPos(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        }
        return temp * x;
    }

}
