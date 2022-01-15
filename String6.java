package DSA;

import java.util.Arrays;

public class String6{

    // this method converts the string to char array
    // sorts the char array
    // convert the char array to string and return it
    static String sortString(String str) {

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        // convert char array back to string
        str = String.valueOf(charArray);

        return str;
    }

    // this method compares each character of the result with
    // individual characters of the first and second string
    static boolean shuffleCheck(String first, String second, String result) {
        String str = first + second;

        if (first.length() + second.length() != result.length()) {
            return false;
        }

        // sort each string to make comparison easier
        str = sortString(str);
        result = sortString(result);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != result.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String first = "XY";
        String second = "12";
        String[] results = {"1XY2", "Y1X2", "Y21XX"};

        // call the method to check if result string is
        // shuffle of the string first and second
        for (String result : results) {
            if (shuffleCheck(first, second, result) == true) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            }
            else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }
    }
}