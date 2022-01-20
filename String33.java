package DSA;

import java.lang.reflect.Array;
import java.util.*;

public class String33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println("Enter the strings :");
            String s = sc.next();
            Solution57 ob = new Solution57();
            System.out.println("Substring of string that contain all character of string: " + ob.findSubString(s));
        }
    }
}

class Solution57 {
    public String findSubString( String str) {
        Map<Character,Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(char i : str.toCharArray()){
            set.add(i);
        }
        int i = -1,j = -1;
        String res = str;

        while(i < str.length() - 1 && j < str.length() - 1){
            while(i < str.length() - 1 && map.size() < set.size()){
                i++;
                char c = str.charAt(i);
                map.put(c,map.getOrDefault(c,0) + 1);
            }
            while(j < i && map.size() == set.size()){
                String temp = str.substring(j+1,i+1);
                if(temp.length() < res.length()){
                    res = temp;
                }
                j++;
                char c = str.charAt(j);
                if(map.get(c) == 1){
                    map.remove(c);
                }
                else{
                    map.put(c,map.get(c) - 1);
                }
            }
        }
        return res;
    }
}