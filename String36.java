package DSA;

import java.util.*;
import java.lang.*;
import java.io.*;

public class String36  {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String[] arr = new String[n];
            System.out.println("Enter values in array of same length: ");
            for(int i=0;i<n;i++){
                arr[i] = sc.next();
            }
            Solution59 ob = new Solution59();
            System.out.println("Anagram of array : ");
            List<List<String>> ans = ob.Anagrams(arr);
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i));
            }
        }
    }
}

class Solution59 {
    public List<List<String>> Anagrams(String[] ar) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> mp = new HashMap<>();

        for(int i=0;i<ar.length;i++){
            char []ch = ar[i].toCharArray();
            Arrays.sort(ch);
            String word = Arrays.toString(ch);
            if(mp.containsKey(word)){
                mp.get(word).add(ar[i]);
            }
            else{
                List<String> a = new ArrayList<>();
                a.add(ar[i]);
                mp.put(word,a);
            }
        }

        for (String s : mp.keySet()) {
            List<String> values = mp.get(s);
            ans.add(values);
        }

        return ans;

    }
}
