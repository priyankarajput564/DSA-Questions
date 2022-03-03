package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting29 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter the value of n  :");
            int n = sc.nextInt();

            Solution84 ob = new Solution84();
            System.out.println("The number whose factorial containing n zeroes is:" + ob.findNum(n));

        }
    }
}

class Solution84
{
    int numZeros(int num) {
        int cnt = 0;
        while(num>0) {
            cnt += num / 5;
            num /= 5;
        }
        return cnt;
    }

    int findNum(int n) {
        int dummy = n * 5, lo = 1, hi = dummy, mid;
        while(lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if(numZeros(mid) < n)
                lo = mid + 1;
            else
                hi = mid-1;
        }
        return lo;
    }
}