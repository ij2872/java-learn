package FireCodeIo;

/**
 * Created by Ivan on 8/28/2017.
 */
public class reverseString {
    public static String reverseString(String str){
        String inputString = str;
        String outputString = "";

        // Catch Cases
        if (str == null) return null;
        if (str.length() < 2) return str;

        for(int i = str.length() - 1; i >= 0; i--){
            outputString += str.charAt(i);
        }

        return outputString;
    }

    public static void main(String[] args){
        // ---Results---]
        System.out.println(reverseString("abcde") + " expected edcba");
        System.out.println(reverseString("1") + " expected 1");
        System.out.println(reverseString("madam") + " expected madam");

    }

}
