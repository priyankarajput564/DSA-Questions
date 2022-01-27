package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            System.out.println("Enter any number greater then 0 :");
            int n = sc.nextInt();
            Solution66 ob = new Solution66();
            System.out.println("No. of perfect squares number before given number n is : " + ob.countSquares(n));

        }
    }
}

class Solution66 {
    static int countSquares(int N) {
        int count = 0;
        int end = (int)Math.sqrt(N);
        for(int i=1;i<=end;i++){
            if(i*i<N){
                count++;
            }
        }
        return count;
    }
}