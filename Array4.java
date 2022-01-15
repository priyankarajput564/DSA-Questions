package DSA;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

class Solution1
{
    public static void sort012(int a[], int n)
    {
        int[] b = new int[n];
        int j = 0;

        for(int i = 0;i < n;i++){
            if(a[i] == 0){
                b[j] = a[i];
                j++;
            }
        }

        for(int i = 0;i < n;i++){
            if(a[i] == 1){
                b[j] = a[i];
                j++;
            }
        }

        for(int i = 0;i < n;i++){
            if(a[i] == 2){
                b[j] = a[i];
                j++;
            }
        }

        for(int i = 0;i < n;i++){
            a[i] = b[i];
        }
    }
}

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }

            Solution1 ob = new Solution1();
            ob.sort012(arr,n);
            StringBuffer str = new StringBuffer();
            for(int i = 0; i<n; i++){
                str.append(arr[i] + " ");
            }
            System.out.println(str);
        }
    }
}
