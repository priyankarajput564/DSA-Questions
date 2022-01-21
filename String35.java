package DSA;

import java.util.*;

// Java program for getting minimum character to be
// added at front to make string palindrome

public class String35
{

    // returns vector lps for given string str
    public static int[] computeLPSArray(String str)
    {
        int n = str.length();
        int lps[] = new int[n];
        int i = 1, len = 0;
        lps[0] = 0; // lps[0] is always 0

        while (i < n)
        {
            if (str.charAt(i) == str.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (len != 0)
                {
                    len = lps[len - 1];

                    // Also, note that we do not increment
                    // i here
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Method returns minimum character to be added at
// front to make string palindrome
    static int getMinCharToAddedToMakeStringPalin(String str)
    {
        StringBuilder s = new StringBuilder();
        s.append(str);

        // Get concatenation of string, special character
        // and reverse string
        String rev = s.reverse().toString();
        s.reverse().append("$").append(rev);

        // Get LPS array of this concatenated string
        int lps[] = computeLPSArray(s.toString());
        return str.length() - lps[s.length() - 1];
    }

    // Driver Code
    public static void main(String args[])
    {
        String str = "AACECAAAA";
        System.out.println(getMinCharToAddedToMakeStringPalin(str));
    }
}

//2nd method for solving problem

/*
// Java program for getting minimum character to be
// added at front to make string palindrome

class GFG {

    // function for checking string is palindrome or not
    static boolean ispalindrome(String s) {
        int l = s.length();

        for (int i = 0, j = l - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // Driver code
    public static void main(String[] args) {
        String s = "BABABAA";
        int cnt = 0;
        int flag = 0;

        while (s.length() > 0) {
            // if string becomes palindrome then break
            if (ispalindrome(s)) {
                flag = 1;
                break;
            } else {
                cnt++;

                // erase the last element of the string
                s = s.substring(0, s.length() - 1);
                //s.erase(s.begin() + s.length() - 1);
            }
        }

        // print the number of insertion at front
        if (flag == 1) {
            System.out.println(cnt);
        }
    }
}

*/


