package DSA;

import java.util.*;

public class String14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            Solution44 ob = new Solution44();
            System.out.println("Minimum no. of operations to convert s1 to s2 : " + ob.minDistance(s1,s2));
        }
    }
}

class Solution44{
    public int minDistance(String word1, String word2){
        //memoization
        int memo[][] = new int[word1.length()+1][word2.length()+1];
        int ans = memo(word1,word2,memo);
        return ans;
    }

    //memoization
    public static int memo(String s,String t,int arr[][]){
        if(s.length()  == 0){
            return t.length();
        }

        if(t.length()  == 0){
            return s.length();
        }

        if(arr[s.length()][t.length()] > 0){
            return arr[s.length()][t.length()];
        }

        if(s.charAt(0) == t.charAt(0)){
            arr[s.length()][t.length()] = memo(s.substring(1), t.substring(1), arr);
            return memo(s.substring(1),t.substring(1),arr);
        }
        else{
            int op1 = memo(s.substring(1), t.substring(1), arr); //Replace in s
            int op2 = memo(s, t.substring(1), arr);  //Insertion in s
            int op3 = memo(s.substring(1), t, arr);  //Deletion in s

            arr[s.length()][t.length()] = 1 + Math.min(op1, Math.min(op2,op3));
            return 1 + Math.min(op1, Math.min(op2,op3));

        }

    }
}