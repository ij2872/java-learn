package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ivan on 9/4/2017.
 */
public class wordBreak {


    //
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] test = new boolean[s.length() + 1];
        test[0] = true;

        for(int i = 0; i < s.length(); i++){

            if(test[i] != false){
                for(int j = i + 1; j <= s.length(); j++){

                    if(wordDict.contains(s.substring(i, j))){
                        test[j] = true;
                    }

                }
            }
        }

        return test[s.length()];
    }

    // -- first try --
//    public static boolean wordBreak(String s, List<String> wordDict) {
//        String rem = s;
//
//        for(String w : wordDict){
//            if(rem.indexOf(w) != -1){
//                int start = w.indexOf(w);
//                int end = w.indexOf(w) + w.length();
//                rem = rem.substring(0, start) + rem.substring(end, rem.length());
//
//                if(rem.length() == 0) return true;
//
//            }
//        }
//
//        return rem.length() == 0 ? true : false;
//    }

    public static void main(String[] args){
        List<String> dict = new ArrayList<>(Arrays.asList("a", "b", "bbb", "bbbb", "leet", "code"));



        System.out.println(wordBreak("leetcode", dict) + " should equal true");

    }
}
