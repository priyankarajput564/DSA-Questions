package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting11 {
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
            int k = sc.nextInt();

            Solution72 ob = new Solution72();
            ArrayList<ArrayList<Integer>> ans = ob.fourSum(arr,k);
            System.out.println("Quad of elements of array whose sum is equal to given number : " + ans );

        }
    }
}

class Solution72 {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Taking a set so as to handle the duplicates
        Set<ArrayList<Integer>> set= new HashSet<>();

        int n=arr.length;

        //similar to 3sum
        for(int i=0;i<n;i++){
            int rem=k-arr[i];

            for(int j=i+1;j<n;j++){
                int trem=rem-arr[j];
                int low=j+1;
                int high=n-1;

                //2 pointer Algo
                while(low<high){
                    if(arr[low]+arr[high]==trem)
                    {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[low]);
                        temp.add(arr[high]);

                        //checking if the set contains the quadruple if not add that to the set and to the result list
                        if(!set.contains(temp))
                        {
                            set.add(temp);
                            list.add(temp);
                        }

                        low++;
                        high--;
                    }
                    else if(trem>arr[low]+arr[high])
                        low++;
                    else
                        high--;
                }
            }
        }
        return list;
    }
}