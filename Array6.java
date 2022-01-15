package DSA;

import java.util.*;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            for(int i=0;i<m;i++){
                b[i] = sc.nextInt();
            }
            Solution2 ob = new Solution2();
            System.out.println(ob.doUnion(a,n,b,m));
        }
    }
}

class Solution2{
    public static int doUnion(int a[], int n, int b[], int m)
    {
        Set<Integer> res = new HashSet<Integer>();
        for(int i : a){
            res.add(i);
        }
        for(int j : b){
            res.add(j);
        }
        return res.size();
    }
}
