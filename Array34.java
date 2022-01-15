package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution26 ob = new Solution26();
            System.out.println(ob.palinArray(arr,n));
        }
    }
}

class Solution26
{
    public static int palinArray(int[] a, int n)
    {
        for(int i=0;i<n;i++){
            int num = a[i];
            int reverse=0;
            while(num>0){
                int r = num%10;
                reverse = (reverse*10) + r;
                num = num/10;
            }
            if(reverse!=a[i]){
                return 0;
            }
        }
        return 1;
    }
}