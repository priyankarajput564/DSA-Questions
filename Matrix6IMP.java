package DSA;

import java.util.*;

public class Matrix6IMP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] matrix = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            Solution34 ob = new Solution34();
            System.out.println("Maximum area formed by 1s of matrix is : " + ob.maxArea(matrix,n,m));
        }
    }
}

class Solution34 {
    public int maxArea(int M[][], int n, int m) {
        int[] curRow = M[0];
        int maxAns = histogram(curRow);
        for(int i=1; i<M.length; i++){
            for(int j=0; j<M[0].length; j++){
                if(M[i][j] == 1){
                    curRow[j] += 1;
                }else{
                    curRow[j] = 0;
                }
            }
            int currAns = histogram(curRow);
            maxAns = Math.max(currAns, maxAns);
        }
        return maxAns;
    }
    public int histogram(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        for(int i = 0;i<n;i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if(st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek() + 1;
            st.push(i);
        }

        // clear the stack to be re-used
        while(!st.isEmpty()) st.pop();

        for(int i = n-1;i>=0;i--) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if(st.isEmpty()) rightSmall[i] = n-1;
            else rightSmall[i] = st.peek() - 1;

            st.push(i);
        }

        int maxA = 0;
        for(int i = 0;i<n;i++) {
            maxA = Math.max(maxA, heights[i] * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;
    }

}
