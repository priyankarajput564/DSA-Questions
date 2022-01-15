package DSA;

import java.util.*;

public class String1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            char[] arr = sc.next().toCharArray();
            Solution36 ob = new Solution36();
            System.out.println("Reverse character array is : ");
            ob.reverseString(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

class Solution36 {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0;i<n/2;i++){
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
    }
}