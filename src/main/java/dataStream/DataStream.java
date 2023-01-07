package dataStream;

import java.util.*;

public class DataStream {
    int cnt = 0;
    int value;
    int k;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
    }

    public boolean consec(int num) {
        if (num == value) {
            cnt++;
        }
        else {
            cnt = 0;
        }
        return cnt >= k;
    }

    public static void main(String[] args) {
        DataStream obj = new DataStream(4, 3);
        System.out.println(obj.consec(4));
        System.out.println(obj.consec(4));
        System.out.println(obj.consec(4));
        System.out.println(obj.consec(3));
        System.out.println(obj.consec(1));

    }
}
