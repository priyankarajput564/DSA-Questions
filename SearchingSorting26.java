package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SearchingSorting26 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            System.out.println("Enter number of elements in array :");
            long N = sc.nextLong();
            System.out.println("Enter value of m :");
            long M = sc.nextLong();
            System.out.println("Enter elements of array :");
            int[] arr = new int[(int)N];

            long max = 0, h = 0;
            long beg, end, mid;
            long cutted;

            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
                if ( arr[ i ] > max ) {
                    max = arr[ i ];
                }
            }
            beg = 0;
            end = max;
            while ( beg <= end ) {
                mid = ( beg + end ) / 2;
                cutted = 0;
                for ( int i = 0; i < N; ++i ) {
                    if ( arr[ i ] - mid > 0 ) {
                        cutted += arr[ i ] - mid;
                    }
                }
                if ( cutted > M ) {
                    beg = mid + 1;
                    if ( mid > h ) {
                        h = mid;
                    }
                }
                else if ( cutted < M ) {
                    end = mid - 1;
                }
                else {
                    h = mid;
                    break;
                }
            }
            System.out.println( "Maximum heigth is :" +  h );
        }
    }
}
