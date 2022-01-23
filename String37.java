package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class String37  {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.next();
            String s2 = sc.next();
            Solution60 ob = new Solution60();
            System.out.println("Smallest window in s1 containing all the characters of another s2 : " + ob.smallestWindow(s1,s2));

        }
    }
}

class Solution60
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        int n = s.length();
        int m = p.length();
        char[] ch = s.toCharArray();
        int i,j;

        HashMap<Character, Integer> hs = new HashMap<>();

        for(i=0;i<m;i++){
            if(!hs.containsKey(p.charAt(i))){
                hs.put(p.charAt(i),1);
            }
            else{
                hs.put(p.charAt(i),hs.get(p.charAt(i)) + 1);
            }
        }

        int count = hs.size();
        String res = "-1";
        int max = Integer.MAX_VALUE;
        i = 0;
        j = 0;

        while(j < n){
            if(hs.containsKey(ch[j])){
                hs.put(ch[j],hs.get(ch[j])-1);

                if(hs.get(ch[j]) == 0){
                    count--;
                }
            }

            while(count == 0){
                int num = j-i+1;

                if(max > num){
                    max = num;
                    res = s.substring(i,j+1);  // i is starting and j is end
                }

                if(hs.containsKey(ch[i])){
                    hs.put(ch[i],hs.get(ch[i]) + 1);

                    if(hs.get(ch[i]) > 0){
                        count++;              //when count > 0 we came out of this loop
                    }
                }
                i++;
            }
            j++;

        }

        return res;

    }
}


