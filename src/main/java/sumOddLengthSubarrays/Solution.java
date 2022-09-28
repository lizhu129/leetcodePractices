package sumOddLengthSubarrays;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currSum = arr[i];
            sum += currSum;
            for (int len = 3; len + i - 1 < arr.length; len += 2) {
                currSum += arr[len + i - 1];
                currSum += arr[len + i - 2];
                sum += currSum;
            }
        }
        return sum;
    }
}
