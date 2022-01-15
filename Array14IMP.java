package DSA;
import java.util.*;
import java.io.*;

public class Array14IMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int r = sc.nextInt();
            int[][] arr = new int[r][2];
            for(int i =0;i<r;i++){
                for(int j =0;j<2;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            Solution9 ob = new Solution9();
           int[][] farr = ob.merge(arr);
           for(int[] a: farr){
               System.out.println(Arrays.toString(a));
           }
        }
    }
}

class Solution9 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (i1, i2) -> i1[0]-i2[0]);

        int[] temp = intervals[0];
        List<int[]> res = new ArrayList<>();
        res.add(temp);
        for (int[] interval : intervals) {
            if (interval[0] <= temp[1]) {
                temp[1] = Math.max(interval[1], temp[1]);
            } else {
                temp = interval;
                res.add(temp);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}