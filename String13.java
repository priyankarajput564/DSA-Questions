package DSA;

import java.util.*;

public class String13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution43 ob = new Solution43();
            System.out.println("Total minimum cost is : " + ob.solveWordWrap(arr,k));
        }
    }
}

class Solution43
{
    public int solveWordWrap (int[] nums, int k)
    {
        // Code here
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return wordwrap(nums,0,dp,k);
    }

    private static int wordwrap(int[] nums, int index, int dp [], int k){
        if(index >= nums.length-1){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int min = Integer.MAX_VALUE;
        int oneline = 0;
        for(int i = index; i < nums.length; i++) {
            oneline += nums[i];
            if(oneline<=k){
                int result = (k-oneline)*(k-oneline) + wordwrap(nums, i+1, dp, k);
                if(i == nums.length - 1){
                    return 0;
                }
                oneline += 1;
                min = Math.min(min,result);
            } else break;
        }
        dp[index] = min;
        return min;
    }
}