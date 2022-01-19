package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println("Enter two strings :");
            String s1 = sc.next();
            String s2 = sc.next();
            int x = s1.length();
            int y = s2.length();
            Solution56 ob = new Solution56();
            System.out.println("Length of Longest common subsequence of two given strings: " + ob.lcs(x,y,s1,s2));
        }
    }
}

class Solution56
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int[][] b = new int[y+1][x+1];
        for(int i = 0;i<y+1;i++){
            for(int j = 0;j<x+1;j++){
                if(i==0||j==0){
                    b[i][j] = 0;
                }
                else if(s2.charAt(i-1) == s1.charAt(j-1)){
                    b[i][j] = b[i-1][j-1] + 1;
                }
                else{
                    b[i][j] = Math.max(b[i-1][j],b[i][j-1]);
                }
            }
        }
        return b[y][x];
    }

}