package DSA;

import java.util.*;

public class Matrix9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            Solution35 ob = new Solution35();
            System.out.println("Kth Smallest element of matrix is : " + ob.kSmallest(matrix,n,k));
        }
    }
}

class Solution35
{
    public static int kSmallest(int[][]mat,int n,int k)
    {
        int arr[]=new int[n*n];
        int o=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[o]=mat[i][j];
                o++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}