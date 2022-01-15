package DSA;

import java.util.*;

public class Matrix4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int r = sc.nextInt();
            int c = sc.nextInt();

            int[][] matrix = new int[r][c];
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            Solution32 ob = new Solution32();
            System.out.println("Index of Row with maximum no of 1 is : " + ob.rowWithMax1s(matrix,r,c));
        }
    }
}

class Solution32 {
    int rowWithMax1s(int arr[][], int n, int m) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int index = 0;

        for(int i=0;i<n;i++){
            for(int a:arr[i]){
                count += a;
            }

            // if(count==m) return i;

            if(count>max){
                max = count;
                index = i;
            }
            count = 0;
        }
        if(max==0){
            return -1;
        }
        return index;
    }
}