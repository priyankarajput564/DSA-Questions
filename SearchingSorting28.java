package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting28 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in Arithmetic progression(AP) :");
            int n = sc.nextInt();
            System.out.println("Enter elements of AP :");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Solution83 ob = new Solution83();
            System.out.println("Missing number of Ap series :" + ob.findMissing(arr,n));

        }
    }
}

class Solution83{
    int findMissing(int arr[], int n) {
        int a, d, l, s, i, sum = 0, missingnumber;
        a = arr[0];
        l = arr[n - 1];

        //Taking the sum of all the elements of the array including the missing element
        //using formulae S(n) = n/2 (a+l)  where a is the first element and l is the last element

        if ((a + l) % 2 == 0)//ensuring this as n/2(a+l) and (a+l)/2 would give diferent values programmatically
        {
            s = (a + l) / 2;
            s = s * (n + 1);  //we use n+1 instead of n because in given array one number is missing
        } else {
            s = (n + 1) / 2;
            s = (a + l) * s;

        }
        //Taking the sum of all the elements of the array excluding the missing element
        for (i = 0; i <= n - 1; i++) {
            sum = sum + arr[i];
        }

        missingnumber = s - sum;

        return missingnumber;
    }
}