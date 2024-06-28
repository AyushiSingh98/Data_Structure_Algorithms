package Queue.SlidingWindow;

public class MaximumSumOfSubarray {
    public static void main(String[] args) {


       // int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int arr[] = {1, 9, -1, -2, 7, 3, -1, 2};
        int k=4;
        System.out.println("Maximum sum " +solve(arr,k));
    }

    public static int solve(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0, max = Integer.MIN_VALUE, sum = 0;
        while (j < n) {
            sum += arr[j];
            if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return max;
    }
}
