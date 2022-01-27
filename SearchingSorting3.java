package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements of rotated array :");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter target element :");
            int x = sc.nextInt();
            Solution65 ob = new Solution65();
            System.out.println("Index of target in array is : " + ob.search(arr,x));

        }
    }
}

class Solution65 {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if(pivot == -1){
            //No rotation,Array is sorted so we can apply binary search
            return binarySearch(nums,target,0,nums.length-1);
        }

        //if pivot is found, we have 2 ascending sub arrays
        if(nums[pivot] == target){
            return pivot;
        }

        //if target>start then we can find it in first half not in second because all elements
        //of 1st half are greater then 2nd half
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }

        //if target<start ,then it is less then pivot also therefore we can find it in 2nd             //half
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;  // pivot is greater then start so it found before mid
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    int binarySearch(int[] nums,int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;   //target found
            }
        }

        return -1; //target not found
    }
}