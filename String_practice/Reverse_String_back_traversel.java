package String_practice;

//Using backward traversal – O(n) Time and O(n) Space
//The idea is to start at the last character of the string and move backward, 
//appending each character to a new string res. This new string res will contain the characters of the original string in reverse order.
public class Reverse_String_back_traversel {
    
    public static void main(String[] args){
        String s = "sreehari krishnan";
        String res = reverse(s);
        System.out.print(res);
    }

    static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));

        }
        return sb.toString();
    }
}
