package mySqrt;

public class Solution {
    public static int mySqrt(int x) {
        if(x==0 || x==1) return x;
        long i = x;
        while(i > x / i) {
            i = (i + x / i) / 2;
        }
        return (int) i;
    }

}
