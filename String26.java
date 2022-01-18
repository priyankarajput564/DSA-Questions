package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution51 ob = new Solution51();
            System.out.println("Decimal number of roman number is: " + ob.romanToDecimal(s));
        }
    }
}

class Solution51 {
    // Finds decimal value of a given roman numeral

    int value(char roman){
        switch(roman){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
    public int romanToDecimal(String str) {

        int n = str.length()-1,p=0,ans=0;

        for(int i=n;i>=0;i--){
            if(value(str.charAt(i))>=p){
                ans=ans+value(str.charAt(i));
            }
            else{
                ans=ans-value(str.charAt(i));
            }

            p=value(str.charAt(i));
        }

        return ans;

    }
}