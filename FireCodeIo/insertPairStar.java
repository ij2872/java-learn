package FireCodeIo;

/**
 * Created by Ivan Jaimes
 */
public class insertPairStar {

    // Recursively comp0ute a new string in which identical adjacent characters are separated by '*'
    public static String insertPairStar(String s){
        if(s == null || s.length() < 2 || s.isEmpty()){
            return s;
        }
        // if s[0] == s[1] add the *
        return s.charAt(0) == s.charAt(1) ? s.substring(0,1) + "*" + insertPairStar(s.substring(1, s.length())) : s.substring(0,1) + insertPairStar(s.substring(1, s.length()));
    }

    public static void main(String[] args){

        // ---Results---
        System.out.println(insertPairStar("cc") + " should equal: c*c");
        System.out.println(insertPairStar("bbb") + " should equal: b*b*b");
        System.out.println(insertPairStar("abbba") + " should equal: ab*b*ba");
        System.out.println(insertPairStar("b") + " should equal: b");

    }
}
