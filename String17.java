package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int n = sc.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(sc.next());
            }
            Solution47 ob = new Solution47();
            System.out.println("Sentence can be broken into words of list (0/1): " + ob.wordBreak(s,list));
        }
    }
}

class Solution47
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        // int n = A.length();
        // boolean[] dp = new boolean[n+1];
        // dp[n] = true;

        // for(int i=n-1;i>=0;i--){
        //     for(int j=i+1;j<=n;j++){
        //         if(B.contains(A.substring(i,j)) && dp[j]){
        //             dp[i] = true;
        //             break;
        //         }
        //     }
        // }

        // return dp[0]?1:0;

        //Another Method
        int[] dp = new int[A.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<=i;j++){
                String w2check = A.substring(j,i+1);
                if(B.contains(w2check)){
                    if(j>0){
                        dp[i] += dp[j-1];
                    }
                    else{
                        dp[i] += 1;
                    }
                }
            }
        }

        if(dp[A.length()-1] > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}