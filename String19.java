package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution48 ob = new Solution48();
            System.out.println("Length of longest prefix and suffix: " + ob.lps(s));
        }
    }
}

class Solution48 {
    int lps(String s) {
        // code here
        int n=s.length();

        int[] pi = new int[n];
        pi[0]=0;

        for(int i=1;i<n;i++)// KMP ALGORITHM
        {
            int j=pi[i-1];

            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j=pi[j-1];
            }

            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            pi[i]=j;
        }

        return pi[n-1];
    }
}