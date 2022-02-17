package DSA;

import java.util.*;

public class SearchingSorting19 {

    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array :");
        int n = sc.nextInt();
        System.out.println("Enter elements of array :");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int t=sc.nextInt();

        while(t-->0){
            int sum=0,count=0;
            int p=sc.nextInt();

            for(int i=0;i<n;i++){
                if(arr[i]<=p){
                    sum+=arr[i];
                    count++;
                }
            }
            System.out.println(count+" "+ sum);
        }
    }
}