package String_practice;

//Using Two Pointers – O(n) Time and O(n) Space
//The idea is to maintain two pointers: left and right, such that left points to the beginning of the string and right points to the end of the string. 
//while left pointer is less than the right pointer, swap the characters at these two positions. 
//After each swap, increment the left pointer and decrement the right pointer to move towards the center of the string. 
//This will swap all the characters in the first half with their corresponding character in the second half.



public class Reverse_String_2pointer {

    public static void main(String[] args){
        String s = "sreehari";
        System.out.print(reverseString(s));
    }
    
    static String reverseString(String s){
        int left = 0, right = s.length()-1;
        StringBuilder res = new StringBuilder(s);    

        while(left<right){
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
        return res.toString();
    }
}
