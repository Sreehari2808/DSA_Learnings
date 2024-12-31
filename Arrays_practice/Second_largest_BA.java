package Arrays_practice;
// [Better Approach] Two Pass Search – O(n) Time and O(1) Space
//The approach is to traverse the array twice. In the first traversal, find the maximum element. 
//In the second traversal, find the maximum element ignoring the one we found in the first traversal.

public class Second_largest_BA {
    
    public static void main(String[] args){
        int[] arr = {2,5,9,11,85,2,6,4,77,88,5,1,12,16,94,66,76,86,25,12,12};
        System.out.print(secondLargest(arr));
    }

    static int secondLargest(int[] arr){
        int n = arr.length;
        int first = -1;
        int second = -1;

        for(int i = 0 ; i<n; i++){
           if(arr[i]>first){
            first = arr[i];
           } 
        }

        for(int i = 0 ; i<n; i++){
            if(arr[i]>second && arr[i]!= first){
                second = arr[i];

            }
        }

        return second;
    }
}
