package DSA;

import java.io.*;
import java.util.*;

public class Array7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Compute ob = new Compute();
            ob.rotate(arr,n);
            StringBuffer str = new StringBuffer();
            for(int i = 0; i<n; i++){
                str.append(arr[i] + " ");
            }
            System.out.println(str);
        }
    }
}

class Compute {

    public void rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}