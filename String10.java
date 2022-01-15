package DSA;
// Java Program to print all subsequence of a
// given string.
import java.util.*;

public class String10 {

    // Set to store all the subsequences
    static HashSet<String> st = new HashSet<>();

    // Function computes all the subsequence of an string
    static void subsequence(String str)
    {

        // Iterate over the entire string
        for (int i = 0; i < str.length(); i++) {

            // Iterate from the end of the string
            // to generate substrings
            for (int j = str.length(); j > i; j--) {
                String sub_str = str.substring(i, j);

                if (!st.contains(sub_str))
                    st.add(sub_str);

                // Drop kth character in the substring
                // and if its not in the set then recur
                for (int k = 1; k < sub_str.length() - 1;
                     k++) {
                    StringBuffer sb
                            = new StringBuffer(sub_str);

                    // Drop character from the string
                    sb.deleteCharAt(k);
                    if (!st.contains(sb))
                        ;
                    subsequence(sb.toString());
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "aabc";
        subsequence(s);
        System.out.println(st);
    }

    //Method 2 for this problem
    // Declare a global list
//    static List<String> al = new ArrayList<>();
//
//    // Creating a public static Arraylist such that
//    // we can store values
//    // IF there is any question of returning the
//    // we can directly return too// public static
//    // ArrayList<String> al = new ArrayList<String>();
//    public static void main(String[] args)
//    {
//        String s = "abcd";
//        findsubsequences(s, ""); // Calling a function
//        System.out.println(al);
//    }
//
//    private static void findsubsequences(String s,
//                                         String ans)
//    {
//        if (s.length() == 0) {
//            al.add(ans);
//            return;
//        }
//
//        // We add adding 1st character in string
//        findsubsequences(s.substring(1), ans + s.charAt(0));
//
//        // Not adding first character of the string
//        // because the concept of subsequence either
//        // character will present or not
//        findsubsequences(s.substring(1), ans);
//    }
}
