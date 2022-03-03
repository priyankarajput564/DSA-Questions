package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting32 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        while(fact > 0){
            System.out.println("Enter number of elements in 1st Array :");
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            else{
                System.out.println("Enter elements of 1st Array :");
                int[] a = new int[n];
                for(int i=0;i<n;i++){
                    a[i] = sc.nextInt();
                }

                System.out.println("Enter number of elements in 2nd Array :");
                int m = sc.nextInt();
                System.out.println("Enter elements of 2nd Array :");
                int[] b = new int[m];
                for(int i=0;i<m;i++){
                    b[i] = sc.nextInt();
                }

                int s1=0, s2=0;
                int i=0, j=0;
                int ans = 0;
                while(i<n && j<m){
                    if(a[i]<b[j]){
                        s1 += a[i++];
                    }
                    else if(a[i]>b[j]){
                        s2 += b[j++];
                    }
                    else{
                        ans = ans + Math.max(s1,s2) + a[i];
                        s1 = s2 = 0;
                        i++;
                        j++;
                    }
                }

                while(i<n){           //when array1 is larger then array2
                    s1 += a[i++];
                }

                while(j<m){           //when array2 is larger then array1
                    s2 += b[j++];
                }

                ans = ans + Math.max(s1,s2);

                System.out.println("The answer is :" + ans);
            }

        }
    }
}
