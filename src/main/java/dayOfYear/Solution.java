package dayOfYear;

public class Solution {
    public static int dayOfYear(String date) {
        int res = 0;
        int[] map = {31, 28, 31, 40, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        for (int i = 0; i < month - 1; i++) {
            res += map[i];
        }
        res += day;
        if (((year%400==0)||(year%4==0 && year%100!=0)) && month >=3) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String date = "2019-01-09";
        System.out.println(dayOfYear(date));
    }
}
