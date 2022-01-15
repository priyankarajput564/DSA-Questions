package DSA;

import java.util.*;

public class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution39 ob = new Solution39();
            System.out.println("Longest substring of given string is : " + ob.longestPalin(s));
        }
    }
}

class Solution39{
    static String longestPalin(String S){
        String ans = "";
        for(int i = 0;i<S.length();i++)
        {
            String odd = oddpali(S,i);
            String even = evenpali(S,i);
            if(ans.length() < odd.length())
                ans = odd;
            if(ans.length() < even.length())
                ans = even;
        }

        return ans;


    }
    static  String oddpali(String s, int idx)
    {
        int i=idx,j = idx;
        while(i>=0 && j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i--;
                j++;
            }
            else
            {
                return s.substring(i+1,j);
            }
            if(i<0 || j>s.length())
                return s.substring(i+1,j);
        }
        return "";
    }
    static String evenpali(String s, int idx)
    {
        int i=idx,j = idx+1;
        while(i>=0 && j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i--;
                j++;
            }
            else
            {
                return s.substring(i+1,j);
            }
        }
        if(i<0 || j>=s.length())
            return s.substring(i+1,j);

        return "";
    }
}