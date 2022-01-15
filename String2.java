package DSA;

import java.util.*;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String S = sc.next();
            Solution37 ob = new Solution37();
            System.out.println("String is Palindrome or not(1 or 0) : " + ob.isPalindrome(S));
        }
    }
}

class Solution37 {
    int isPalindrome(String S) {
        int ans = 1;
        char[] arr = S.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                ans = 0;
            }
            i++;
            j--;
        }
        return ans;
    }
};