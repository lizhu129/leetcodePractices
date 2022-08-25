package RomanToInteger;

import java.util.HashMap;
import java.util.Map;


// Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] chars = s.toCharArray();
        int a = 0;
        int sum = 0;
        while (a < chars.length - 1) {
            if (map.get(chars[a]) >= map.get(chars[a + 1])) {
                sum = sum + map.get(chars[a]);
            } else {
                sum = sum - map.get(chars[a]);
            }
            a++;
        }
        return sum + map.get(chars[chars.length - 1]);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

}
