package DSA;

import java.util.*;

public class String12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            Solution42 ob = new Solution42();
            System.out.println("Number of Substrings with equal no of 0 and 1 of given string is : " + ob.maxSubStr(s,n));
        }
    }
}

class Solution42{
    int maxSubStr(String str, int n){
        int count0 = 0, count1 = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '0'){
                count0++;
            }
            else{
                count1++;
            }
            if(count0 == count1){
                count++;
            }
        }
        //It is not possible to split the string
        if(count0 != count1){
            return -1;
        }
        else{
            return count;
        }

    }
}

