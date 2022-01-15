package DSA;

import java.util.*;

public class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution40 ob = new Solution40();
            System.out.println("Longest reapting subsequence of given string is : " + ob.LongestRepeatingSubsequence(s));
        }
    }
}

class Solution40
{
    public int LongestRepeatingSubsequence(String s)
    {
        int lambaiii = s.length();

        int motarix[][] = new int[lambaiii+1][lambaiii+1];

        for(int i=1;i<lambaiii+1;i++){
            for(int j=1;j<lambaiii+1;j++){
                if(s.charAt(i-1)==s.charAt(j-1) && i!=j){
                    motarix[i][j] = 1+ motarix[i-1][j-1];
                }
                else{
                    motarix[i][j] = Math.max(motarix[i-1][j], motarix[i][j-1]);
                }
            }
        }

        return motarix[lambaiii][lambaiii];
    }
}