package DSA;

import java.util.*;

public class String16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution46 ob = new Solution46();
            System.out.println("String have balanced brackets : " + ob.ispar(s));
        }
    }
}

class Solution46
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<Character>();

        for(int i=0;i<x.length();i++){
            char ch = x.charAt(i);

            if(ch == '{' || ch == '[' || ch == '('){
                s.push(ch);
            }
            else if(!s.empty() && ch == '}' && s.peek() == '{'){
                s.pop();
            }
            else if(!s.empty() && ch == ']' && s.peek() == '['){
                s.pop();
            }
            else if(!s.empty() && ch == ')' && s.peek() == '('){
                s.pop();
            }
            else{
                s.push(ch);
            }
        }

        if(s.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}
