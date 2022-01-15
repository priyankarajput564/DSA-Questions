package DSA;

import java.util.*;

public class String15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution45 ob = new Solution45();
            List<Integer> ArrList = ob.nextPermutation(n,arr);
            System.out.println("Next Permutation of given array is: " + ArrList);
        }
    }
}

class Solution45{
    // Utility function to swap two digit
    static void swap(int ar[], int i, int j)
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // Given a number as a char array number[],
    // this function finds the next greater number.
    // It modifies the same array to store the result
    static List<Integer> nextPermutation(int n, int ar[])
    {
        List<Integer> list = new ArrayList<>();
        int i;

        // I) Start from the right most digit
        // and find the first digit that is smaller
        // than the digit next to it.
        for (i = n - 1; i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }

        // If no such digit is found, then all
        // digits are in descending order means
        // there cannot be a greater number with
        // same set of digits
        if (i == 0)
        {
            for(int j=n-1;j>=0;j--){
                list.add(ar[j]);
            }
            return list;
        }
        else
        {
            int x = ar[i - 1], min = i;

            // II) Find the smallest digit on right
            // side of (i-1)'th digit that is greater
            // than number[i-1]
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }

            // III) Swap the above found smallest
            // digit with number[i-1]
            swap(ar, i - 1, min);

            // IV) Sort the digits after (i-1)
            // in ascending order
            Arrays.sort(ar, i, n);
            for (i = 0; i < n; i++){
                list.add(ar[i]);
            }
        }
        return list;
    }
}