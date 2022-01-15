package DSA;

        import java.util.*;

public class Matrix3VIMP {
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
            Solution31 ob = new Solution31();
            System.out.println("Median of matrix : " + ob.findMedian(matrix));
        }
    }
}

class Solution31 {
//    int findMedian(int matrix[][], int r, int c) {
//        int arr[]=new int[r*c];
//        int size=0;
//        for (int i = 0; i < r; i++)
//        {
//            for (int j = 0; j < c; j++)
//            {
//                arr[size++]=matrix[i][j];
//            }
//        }
//        Arrays.sort(arr);
//        return arr[arr.length/2];
//    }
    private int countSmallerThanMid(int[] row, int mid) {
        int l = 0, h = row.length - 1;
        while(l <= h) {
            int md = (l + h) >> 1;
            if(row[md] <= mid) {
                l = md + 1;
            }
            else {
                h = md - 1;
            }
        }
        return l;
    }
    public int findMedian(int[][] A) {
        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE;
        int n = A.length;
        int m = A[0].length;
        while(low <= high) {
            int mid = (low + high) >> 1;
            int cnt = 0;
            for(int i = 0;i<n;i++) {
                cnt += countSmallerThanMid(A[i], mid);
            }

            if(cnt <= (n * m) / 2) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}