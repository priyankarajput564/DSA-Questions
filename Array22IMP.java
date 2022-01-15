package DSA;

import java.io.*;
import java.util.*;
import java.math.*;

public class Array22IMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int N = sc.nextInt();
            Solution16 ob = new Solution16();
            ArrayList<Integer> ans = ob.factorial(N);
            for(Integer value: ans){
                System.out.print(value);
            }
            System.out.println();
        }
    }
}

class Solution16{
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> list = new ArrayList<>();
        BigInteger fact = new BigInteger("1");
        for(int i=N;i>0;i--){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        String stringFact = fact.toString();
        for(int i=1;i<=stringFact.length();i++){
            list.add(Integer.parseInt(stringFact.substring(i-1,i)));
        }
        return list;
    }
}