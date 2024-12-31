package Arrays_practice;
public class Linear_Search {
    public static void main(String[] args){

        int arr[] = {2, 3, 4, 10, 40,50, 20, 50, 22};
        int x = 10;
        int result = linearSearch(arr, x, arr.length);
        if(result==-1){
            System.out.print("Element is not present in array");
        }
        else{
            System.out.print("Element found at index " + result);
        }
    }

    public static int linearSearch(int[] arr, int x,  int L) {

      for(int i =0; i<L; i++) {
        if(arr[i]==x){
            return i;
        }  
    } 
                
     return -1;     
    }
}
