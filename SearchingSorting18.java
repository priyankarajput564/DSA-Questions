package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting18 {
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

            Solution79 ob = new Solution79();
            System.out.println("Minimum number of swaps to sort the array :" + ob.minSwaps(arr));

        }
    }
}

class Solution79
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int n=nums.length;
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }

        Arrays.sort(a);
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(a[i],i);
        }

        int count=0;

        for(int i=0;i<n;i++) {
            while(hm.get(nums[i])!=i) {
                count++;
                swap(nums,hm.get(nums[i]),i);
            }
        }
        return count;
    }

    static void swap(int a[],int i,int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}