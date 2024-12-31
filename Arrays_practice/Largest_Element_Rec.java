package Arrays_practice;
// Recursive Approach – O(n) Time and O(n) Space
// The idea is similar to the iterative approach. Here the traversal of the array is done recursively instead of an iterative loop. 

public class Largest_Element_Rec {
    
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 11, 4, 9, 13, 26, 2, 46, 76,12};
        System.out.print(largest(arr));
    }

    public static int largest(int[] arr){
        return findMax(arr, 0);
    }

    public static int findMax(int[] arr, int i){
        if(i== arr.length-1){
            return arr[i];
        }
        int recMax = findMax(arr, i+1);
        return Math.max(recMax,arr[i]);
    }
}
