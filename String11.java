package DSA;

import java.util.*;

public class String11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Solution41 ob = new Solution41();
            System.out.println("Permutations of given string is : ");
            List<String> list = ob.find_permutation(s);
            for(String item:list){
                System.out.print(item + " ");
            }
        }
    }
}

class Solution41{
    public List<String> find_permutation(String S) {
        List<String> list = new ArrayList<>();
        help(list,S,"");
        Collections.sort(list);
        return list;
    }

    public void help(List<String> list, String str, String ans){
        if(str.length()==0){
            list.add(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            help(list,str.substring(0,i) + str.substring(i+1),ans+ch);
        }
    }
}