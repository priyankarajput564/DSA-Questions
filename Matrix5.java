package DSA;

import java.util.*;

public class Matrix5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();

            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            Solution33 ob = new Solution33();
            ob.sortedMatrix(n,matrix);
            System.out.println("After Sorting Matrix is : ");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

class Solution33{
    int[][] sortedMatrix(int n, int Mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.add(Mat[i][j]);
            }
        }

        Collections.sort(list);
        int x=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Mat[i][j] = list.get(x);
                x++;
            }
        }

        return Mat;
    }
};