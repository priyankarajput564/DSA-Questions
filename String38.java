package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class String38  {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            Solution61 ob = new Solution61();
            System.out.println("String after removing repeating consecutive characters from string : " + ob.removeConsecutiveCharacter(s));

        }
    }
}

class Solution61{
    public String removeConsecutiveCharacter(String S){
        String str="";
        for(int i=0;i<S.length();i++){
            if(i==0){
                str=str+S.charAt(i);
            }
            else{
                if(S.charAt(i-1)!=S.charAt(i)){
                    str=str+S.charAt(i);
                }
            }
        }
        return str;
    }
}