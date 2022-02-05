package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in array :");
            int n = sc.nextInt();
            System.out.println("Enter elements of array :");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Solution69 ob = new Solution69();
            System.out.println("Element of array occur more then n/2 times : " + ob.majorityElement(arr,n) );

        }
    }
}

class Solution69
{
    static int majorityElement(int a[], int size)
    {
        //Moores Voting Algorithm
        int count =0,num=0;

        for(int i=0;i<size;i++){
            if(a[i]==num) count++;
            else count--;

            if(count<=0){
                num = a[i];
                count=1;
            }
        }
        int check=0;
        for(int i=0;i<size;i++){
            if(a[i]==num)check++;
        }
        if(check>(size/2))
            return num;
        return -1;
    }
}