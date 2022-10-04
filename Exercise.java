import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, -3, 6 };
        int k = 11;
        System.out.println(findPair(arr, k));
    }

    /**
     * Name: findPair
     * 
     * @param arr
     * @param k
     * @return boolean
     * 
     *         Inside: checks if there exist two elements in arr
     *         such that we get k when we add them together.
     */
    public static boolean findPair(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == k) {
                    return true;
                }
            }
        }
        return false;
    }
}