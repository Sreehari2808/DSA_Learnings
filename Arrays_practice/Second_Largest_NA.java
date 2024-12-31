package Arrays_practice;
// [Naive Approach] Using Sorting – O(n*logn) Time and O(1) Space
// The idea is to sort the array in non-decreasing order. Now, we know that the largest element will be at index n – 1. 
//So, starting from index (n – 2), traverse the remaining array in reverse order. 
//As soon as we encounter an element which is not equal to the largest element, return it as the second largest element in the array. \
//If all the elements are equal to the largest element, return -1.
import java.util.Arrays;

public class Second_Largest_NA {

    public static void main(String[] args){

        int[] arr = {5,6,8,11,2,3,4,77,18,19,24,39};
        System.out.print(secondLargest(arr));
    }

    public static int secondLargest(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);    // after sort arr = {2,3,4,5,6,8,11,18,19,24,39,77}
       for(int i = n-2; i>=0;i--){
        if(arr[i]!= arr[n-1]){
            return arr[i];
        }
       }
        
        return -1;
    }
    
}
