package DSA;
import java.util.*;
import java.io.*;
import java.lang.*;

class Array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            System.out.println(new Reverse().reverseWord(str));;
        }
    }
}

class Reverse
{
    public static String reverseWord(String str)
    {
        char[] nstr = str.toCharArray();
        int j = nstr.length-1;
        for(int i = 0;i<nstr.length/2;i++){
            char temp = nstr[i];
            nstr[i] = nstr[j];
            nstr[j] = temp;
            j--;
        }

        return new String(nstr);
    }
}
