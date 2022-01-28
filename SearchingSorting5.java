package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            System.out.println("Enter number of elements in array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of array :");
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }

            Solution67 ob = new Solution67();
            pair product = ob.getMinMax(arr,n);
            System.out.println("Minimum and maximum element of array : " + product.first + " " + product.second );

        }
    }
}

class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

class Solution67{
        static pair getMinMax(long a[], long n)
        {
            long min = a[0];
            long max = a[0];

            for(int i=1;i<n;i++){
                if(min > a[i]){
                    min = a[i];
                }
                if(max < a[i]){
                    max = a[i];
                }
            }

            return (new pair(min,max));

        }
    }
