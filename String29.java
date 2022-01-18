package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println("Enter the number of elements in string array:");
            int n = sc.nextInt();
            String[] arr = new String[n];
            System.out.println("Enter the strings of array:");
            for(int i=0;i<n;i++){
                arr[i] = sc.next();
            }
            Solution54 ob = new Solution54();
            System.out.println("Second most repeating string of given string array is: " + ob.secFrequent(arr,n));
        }
    }
}

class Solution54
{
    String secFrequent(String arr[], int n)
    {
        int max = 1, second = 0;
        StringBuilder output = new StringBuilder("");

        HashMap<String,Integer> map = new HashMap<String, Integer>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }

            if((int)map.get(arr[i]) > max){
                max = (int)map.get(arr[i]);
            }
        }

        for(Map.Entry m: map.entrySet()){
            if((int)m.getValue()>second && (int)m.getValue()<max){
                second = (int)m.getValue();
                output.setLength(0);
                output.append(m.getKey());
            }
        }
        return output.toString();
    }
}