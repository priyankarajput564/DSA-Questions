package DSA;

import java.io.*;
import java.util.*;
import java.math.*;

public class Array19{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            int[] A = new int[n1];
            int[] B = new int[n2];
            int[] C = new int[n3];

            for(int i=0;i<n1;i++){
                A[i] = sc.nextInt();
            }
            for(int i=0;i<n2;i++){
                B[i] = sc.nextInt();
            }
            for(int i=0;i<n3;i++){
                C[i] = sc.nextInt();
            }
            Solution14 ob = new Solution14();
            System.out.println(ob.commonElements(A,B,C,n1,n2,n3));
        }
    }
}

class Solution14
{
    ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<n1)
        {
            if(j==n2 || k==n3)
                break;

            if(A[i]==B[j] && A[i]==C[k])
            {
                if(!list.contains(A[i]))
                    list.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if(A[i]<=B[j] && A[i]<=C[k])
                i++;
            else if(B[j]<=A[i] && B[j]<=C[k])
                j++;
            else if(C[k]<=A[i] && C[k]<=B[j])
                k++;

        }
        return list;
    }
}