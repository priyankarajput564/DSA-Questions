package DSA;

import java.util.Arrays;
import java.util.*;

public class Array16_Mergesort {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] arr = new long[(int)n];

            for (long i = 0; i < n; i++) {
                arr[(int)i] = sc.nextLong();
            }
            Solution11 ob = new Solution11();
            System.out.println(ob.inversionCount(arr, n));
        }
    }
}

class Solution11
{

    public long inversionCount(long arr[], long N)
    {
        return sort(arr,0,(int)N-1);
    }

    public long sort(long[] arr,int l ,int r){
        if(l>=r){
            return 0;
        }
        long count = 0;
        int m = l +(r-l)/2;
        count += sort(arr,l,m);
        count+=sort(arr,m+1,r);
        count+=merge(arr,l,m,r);
        return count;
    }

    public long merge(long[] arr,int l,int m,int r){

        int n1 = m - l + 1;
        int n2 = r - m;


        long left[] = new long[n1];
        long right[] = new long[n2];


        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];


        int i = 0, j = 0, k = l;
        long count = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                count += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return count;

    }

}
