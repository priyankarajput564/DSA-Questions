package DSA;

import java.util.*;

public class Matrix1 {
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
            Solution29 ob = new Solution29();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for(Integer val: ans){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Solution29
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int m, int n)
    {
        int u = 0;
        int r = m-1;
        int l = 0;
        int d = n-1;

        ArrayList<Integer> al = new ArrayList<>();

        while(u<=r && l<=d)
        {
            //traverse horizontally forward
            for(int i = l ; i<=d ; i++)
                al.add(matrix[u][i]);
            u++;

            //traverse vertically downwards
            for(int i = u ; i<=r ; i++)
                al.add(matrix[i][d]);
            d--;

            //traverse horizontally backwards
            if(u<=r)
            {
                for(int i = d ; i>=l ; i--)
                    al.add(matrix[r][i]);
                r--;
            }

            //traverse vertically upwards
            if(l<=d)
            {
                for(int i = r ; i>=u ; i--)
                    al.add(matrix[i][l]);
                l++;
            }


        }
        return al;
    }
}
