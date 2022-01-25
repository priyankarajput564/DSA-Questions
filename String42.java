package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class String42  {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            Solution62 ob = new Solution62();
            System.out.println("Both strings are isomorphic : " + ob.areIsomorphic(s1,s2));

        }
    }
}

class Solution62
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length() != str2.length()){
            return false;
        }

        HashMap<Character,Integer> hash = new HashMap<>();
        HashMap<Character,Integer> hash1 = new HashMap<>();
        for(int i = 0;i<str1.length();i++){
            if(!hash.containsKey(str1.charAt(i))){
                hash.put(str1.charAt(i),i);
            }
            if(!hash1.containsKey(str2.charAt(i))){
                hash1.put(str2.charAt(i),i);
            }
            int b = hash.get(str1.charAt(i));
            int c = hash1.get(str2.charAt(i));
            if(b != c){
                return false;
            }
        }
        return true;

    }
}