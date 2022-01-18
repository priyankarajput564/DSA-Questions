package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution53 ob = new Solution53();
            System.out.println("Minimum number of flips required to make alternate 0 and 1 in string: " + ob.minFlips(s));
        }
    }
}

class Solution53 {
    public int minFlips(String S) {
        /* there are 2 posibility 1010101 || 01010101 we only have to know which is less correct
        thats our ans to know which one is less correct we simpliy check that position by assume
        even position as 1 and odd position as 0 | even position as 0 and odd position as 1 */
        int n = S.length();
        int cntS1 = 0; // there are 2 posibility 1010101 || 01010101 we
        int cntS2 = 0;
        for(int i=0;i<n;i++) {
            if(i%2==0 && S.charAt(i) == '1' || i%2!=0 && S.charAt(i) =='0') cntS1++;
            if(i%2==0 && S.charAt(i) == '0' || i%2!=0 && S.charAt(i) =='1') cntS2++;
        }

        return Math.min(cntS1,cntS2);
    }
}