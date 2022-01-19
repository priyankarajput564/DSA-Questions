package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println("Enter string consist of [ and ] bracket only :");
            String s = sc.next();
            Solution55 ob = new Solution55();
            System.out.println("Number of swaps for making balanced string of brackets [] : " + ob.minimumNumberOfSwaps(s));
        }
    }
}

class Solution55{
    static int minimumNumberOfSwaps(String S){
        int open = 0, close = 0, unbalance = 0, swp = 0;
        for(char c: S.toCharArray()) {
            if(c==']') close++;
            else if(c=='[') {
                if(unbalance>0) {
                    swp+=unbalance;
                }
                open++;
            }
            unbalance = close-open;
        }
        return swp;

        //second method

        // int c = 0;int sum = 0;
        // for(int i =0;i<S.length();i++){
        //     if(S.charAt(i) == ']'){
        //         c = c + 1;
        //     }
        //     else{
        //         if(c>0) sum = sum + c;
        //         c = c - 1;
        //     }
        // }
        // return sum;
    }
}