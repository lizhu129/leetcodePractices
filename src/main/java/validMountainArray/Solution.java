package validMountainArray;

public class Solution {

    public static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if (len < 3) {
            return false;
        }
        int index = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                index = i + 1;
            }
        }
        if (index == len - 1 || index == 0) {
            return false;
        }
        for (int i = 0; i < index - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        for (int i = index; i < len - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

     boolean validArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }

    public static void main(String[] args) {
        int arr[] = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr));
    }
}
