/**Given an array of integers arr that contains n+1 elements between 1 and n inclusive, create a function that returns the duplicate element (the element that appears more than once). Assume that:
- There is only one duplicate number
- The duplicate number can be repeated more than once
*/
public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 1};
        int[] arr2 = {4, 2, 2, 3, 1};


        
        System.out.println(findDuplicate(arr2));

    }

    public  static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
            
        }
        return 0;
    }
}
