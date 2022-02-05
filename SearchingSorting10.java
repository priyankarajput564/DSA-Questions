package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in array :");
            int size = sc.nextInt();
            System.out.println("Enter elements of array :");
            int[] arr = new int[size];
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter any number :");
            int n = sc.nextInt();

            Solution71 ob = new Solution71();
            System.out.println("Pair of elements in array whose difference is equal to n : " + ob.findPair(arr,size,n) );

        }
    }
}

class Solution71
{
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);

        for(int i=0; i< size-1; i++){

            for (int j= i+1; j< size; j++){

                if (arr[j]-arr[i] == n)
                    return true;
            }
        }

        return false;
    }
}