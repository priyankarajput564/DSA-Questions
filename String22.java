package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution50 ob = new Solution50();
            System.out.println("Number of palindromic subsequences of string is: " + ob.countPS(s));
        }
    }
}

class Solution50
{
    long countPS(String str)
    {
        int n=str.length(),j;
        long mod = 1000000007;
        long[][] dp = new long[n][n];
        for(int l=0;l<n;l++){
            for(int i=0;i<n-l;i++){
                j=l+i;
                if(i==j){
                    dp[i][i]=1;
                }
                else if(str.charAt(i)==str.charAt(j)){
                    dp[i][j]=1+dp[i+1][j]+dp[i][j-1];
                }
                else{
                    dp[i][j]=dp[i+1][j]+dp[i][j-1]
                            -dp[i+1][j-1];
                }
                dp[i][j]+=mod;
                dp[i][j]%=mod;
            }
        }
        return dp[0][n-1];
    }
}