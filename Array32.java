package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int N = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            Solution24 ob = new Solution24();
            ob.threeWayPartition(arr,a,b);
        }
    }
}

class Solution24{
    //Function to partition the array around the range such
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int n = array.length;
        int[] arr = new int[n];
        int j = 0;

        for(int i=0;i<n;i++){
            if(array[i]<a){
                arr[j] = array[i];
                j++;
            }
        }

        for(int i=0;i<n;i++){
            if(array[i]>=a && array[i]<=b){
                arr[j] = array[i];
                j++;
            }
        }

        for(int i=0;i<n;i++){
            if(array[i]>b){
                arr[j] = array[i];
                j++;
            }
        }

        for(int i=0;i<n;i++){
            array[i] = arr[i];
        }
    }
}
