package DSA;

import java.io.*;
import java.util.*;

public class Array28 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Solution21 ob = new Solution21();
            System.out.println(ob.find3Numbers(arr,n,x));
        }
    }
}

class Solution21
{

    public boolean find3Numbers(int a[], int n, int X) {
        if(n<3){
            return false;
        }
        if(n==3){
            return (a[0]+a[1]+a[2] == X);
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i==0 || (i>0 && a[i-1]!=a[i])){
                int j=i+1;
                int k=n-1;
                while(j<k){
                    if(a[i]+a[j]+a[k]==X){
                        return true;
                    }
                    else if(a[i]+a[j]+a[k]<X){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }
        }
        return false;
    }
}
