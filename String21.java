package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution49 ob = new Solution49();
            System.out.println("Reversal of brackets needed to Balance String of bracket{}: " + ob.countRev(s));
        }
    }
}

class Solution49
{
    int countRev (String s)
    {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '{'){
                stack.push(c);
            }
            else if(stack.size() == 0){
                count = count+1;
                stack.push(c);  //for adding '}' to stack
            }
            else{
                stack.pop();
            }
        }

        if(stack.size()%2 != 0){
            return -1;
        }
        else{
            return count + (int)stack.size()/2;
        }
    }
}