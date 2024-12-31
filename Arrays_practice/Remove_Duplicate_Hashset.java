package Arrays_practice;

import java.util.HashSet;

//Using Hash Set – Works for Unsorted Also – O(n) Time and O(n) Space

//Use a hash set or dictionary to store elements already processed
//Initialize index of result array as 0.
//Traverse through the input array. If an element is not in the hash set, put it at the result index and insert into the set.



public class Remove_Duplicate_Hashset {

    public static void main(String[] args){

        int[] arr = {1,1,2,3,3,4,5,6,55,12,16,65,16,1,9,5,4,13};
        int newSize = removeDuplicate(arr);
        for(int i = 0; i<newSize; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicate(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[idx++] = arr[i];
                
            }
        }
        return idx;
    }
    
    
}
