import java.util.*;
//Given an array of integers arr, create a function that returns an array containing the values of arr without duplicates (the order doesn't matter).
public class Exercise3 {


    public static void main(String[] args) {
        int [] arr = {4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3};
        
        System.out.println(removeDuplicates(arr));
        
    }

    public static LinkedHashSet<Integer> removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set;


    }

}