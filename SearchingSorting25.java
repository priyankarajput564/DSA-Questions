package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting25 {
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

            System.out.println("Enter value of m :");
            int m = sc.nextInt();

            Solution82 ob = new Solution82();
            System.out.println("Maximum number of pages allocated to a student is the minimum of those in all the other permutations :" + ob.findPages(arr,n,m));

        }
    }
}

class Solution82
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        int s=0;
        int sum =0;

        for(int i=0; i<N; i++){
            sum += A[i];
        }
        int e = sum;
        int ans = -1;

        int mid = s+(e-s)/2;

        while(s<=e){

            if(isPossible(A, N, M, mid)){
                ans = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }

    static boolean isPossible(int A[], int N, int M, int mid){
        int studentCount =1;
        int pageSum =0;

        for(int i =0; i<N; i++){
            if(pageSum + A[i] <= mid){
                pageSum += A[i];
            }
            else{
                studentCount++;

                if(studentCount > M || A[i]>mid){
                    return false;
                }
                pageSum = 0;
                pageSum += A[i];
            }
        }
        return true;
    }

};