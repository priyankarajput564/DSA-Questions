package DSA;
// for printing single duplicate value in array
import java.io.*;
import java.util.*;

public class Array12{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++){
                arr2[i] = sc.nextInt();
            }
            Solution7 ob = new Solution7();
            ob.merge(arr1,arr2,n,m);

            StringBuffer str = new StringBuffer();
            for (int i=0;i<n;i++){
                str.append(arr1[i] + " ");
            }
            for (int i=0;i<m;i++){
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
    }
}

class Solution7 {

    public void merge(int arr1[], int arr2[], int n, int m) {
        int[] arr = new int[n+m];
        System.arraycopy(arr1,0,arr,0,n);
        System.arraycopy(arr2,0,arr,n,m);
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            arr1[i] = arr[i];
        }

        for(int i = n;i<m+n;i++){
            arr2[i-n] = arr[i];
        }

    }
}
