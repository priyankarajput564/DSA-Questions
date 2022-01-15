package DSA;

import java.util.*;

public class Matrix2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int r = sc.nextInt();
            int c = sc.nextInt();
            int target = sc.nextInt();

            int[][] matrix = new int[r][c];
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            Solution30 ob = new Solution30();
            System.out.println("Given element is present in matrix : " + ob.searchMatrix(matrix,target));
        }
    }
}

class Solution30 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            throw new IllegalArgumentException("Input is null");
        }
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int lo = 0;
        int hi = (n*m) - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int r = mid / m;
            int c = mid % m;
            if (target == matrix[r][c]) {
                return true;
            }
            if (target < matrix[r][c]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return false;

    }
}