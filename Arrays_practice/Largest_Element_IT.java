package Arrays_practice;
//Iterative Approach – O(n) Time and O(1) Space
// The approach to solve this problem is to traverse the whole array and find the maximum among them.

public class Largest_Element_IT {

    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 11, 4, 9, 13, 26, 2, 46, 76,12, 183};
        System.out.print(largest(arr));
    }
    
    public static int largest(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;


    }
}
