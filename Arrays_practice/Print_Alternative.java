package Arrays_practice;
// this is itterative approch
import java.util.*;

class arrayTest{

    static ArrayList<Integer> getAlternates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr ={11,12,13,14,15,16,17,18,19,20,21};
        ArrayList<Integer> list = getAlternates(arr);
        for(int x:list){
            System.out.print(x + " ");
        }

    }
    
}