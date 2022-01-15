package DSA;
// for printing single duplicate value in array
import java.io.*;
import java.util.*;

public class Array11{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution6 ob = new Solution6();
            System.out.println(ob.findDuplicate(arr));
        }
    }
}

class Solution6 {
    HashSet<Integer> set = new HashSet<>();
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }
}