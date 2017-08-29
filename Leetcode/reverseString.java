package Leetcode;

/**
 * Created by Ivan.
 */
public class reverseString {
    public static String reverseString(String s) {
        char[] rs = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while(i<j){
            char temp = rs[i];
            rs[i] = rs[j];
            rs[j] = temp;
            i++;
            j--;
        }

        return new String(rs);
    }

    public static void main(String[] args){
        // ---Results---]
        System.out.println(reverseString("abcde") + " expected edcba");
        System.out.println(reverseString("1") + " expected 1");
        System.out.println(reverseString("madam") + " expected madam");

    }
}
