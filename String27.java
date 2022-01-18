package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println("Enter the number of elements in string array:");
            int n = sc.nextInt();
            String[] arr = new String[n];
            System.out.println("Enter the strings of array:");
            for(int i=0;i<n;i++){
                arr[i] = sc.next();
            }
            Solution52 ob = new Solution52();
            System.out.println("Common prefix of all strings of array: " + ob.longestCommonPrefix(arr));
        }
    }
}

class Solution52 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;

        /*due to sorting we don't need to check all string we only check first and last string
        Because when 1st character of 1st string don't match with 1st character of last then it is not common in all strings.
        In same way we compare other character also*/
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}