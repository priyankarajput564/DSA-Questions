package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            System.out.println("Enter number of stalls in array :");
            int n = sc.nextInt();
            System.out.println("Enter number cow :");
            int cows = sc.nextInt();
            System.out.println("Enter elements of array :");
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Solution81 ob = new Solution81();

            int low = 1, high = a[n-1] - a[0];

            while(low <= high) {
                int mid = (low + high) >> 1;

                if(ob.isPossible(a,n,cows,mid)) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            System.out.println("Answer is : " + high);
        }

    }
}

class Solution81{
    boolean isPossible(int a[], int n, int cows, int minDist) {
        int cntCows = 1;
        int lastPlacedCow = a[0];
        for(int i = 1;i<n;i++) {
            if(a[i] - lastPlacedCow >= minDist) {
                cntCows++;
                lastPlacedCow = a[i];
            }
        }
        if(cntCows >= cows) return true;
        return false;
    }
}