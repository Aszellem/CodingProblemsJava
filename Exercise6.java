public class Exercise6 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -6, 4, 2, -8, 3 };
        System.out.println(maximumSubarray(arr));
    }

    public static int maximumSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}