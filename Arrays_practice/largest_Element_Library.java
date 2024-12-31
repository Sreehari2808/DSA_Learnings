package Arrays_practice;
import java.util.Arrays;

public class largest_Element_Library {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 11, 4, 9, 13, 26, 2, 46, 76,12};
        System.out.print(largest(arr));
    }

    public static int largest(int[] arr){
        Arrays.sort(arr); // in build library in most of the languages 
        return arr[arr.length-1];

    }
}
