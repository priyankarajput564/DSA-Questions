package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting17 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t -- >0){
            System.out.println("Enter number of elements in array :");
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println("Enter elements of array :");
            Integer[] arr = new Integer[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution78 ob = new Solution78();
            ob.sortBySetBitCount(arr, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++){
                output.append(arr[i] + " ");
            }
            System.out.println("Sort array by set bit count : " + output);

        }
    }
}

class Solution78
{
    static void sortBySetBitCount(Integer arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr, (n1,n2) -> {
            if(Integer.bitCount(n1)>Integer.bitCount(n2))
                return -1;
            if(Integer.bitCount(n1)<Integer.bitCount(n2))
                return 1;
            return 0;
        });
    }
}

