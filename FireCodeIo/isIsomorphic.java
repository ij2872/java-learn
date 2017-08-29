package FireCodeIo;
import java.util.HashMap;

/**
 * Created by Ivan Jaimes
 */
public class isIsomorphic {

    // Two strings are isomorphic if the letters in one string can be remapped to get the second string.
    // EX: input1="abcabc" input2="xyzxyz" return: true
    //     input1="add" input2="egg" return: true
    //     input1="abcd" input2="aabb" return: false
    public static boolean isIsomorphic(String input1, String input2){
        // Test for same length
        if(input1.length() != input2.length()){
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();


        for(int i=0; i<input1.length(); i++){

            // Check if current character exists, if false add to map with key=input1[i] value=input2[i]
            // if
            if(map1.containsKey(input1.charAt(i))){
                if(map1.get(input1.charAt(i)) != input2.charAt(i)){
                    return false;
                }
            } else {
                map1.put(input1.charAt(i),input2.charAt(i));
            }

            if(map2.containsKey(input2.charAt(i))){
                if(map2.get(input2.charAt(i)) != input1.charAt(i)){
                    return false;
                }
            } else {
                map2.put(input2.charAt(i),input1.charAt(i));
            }

        }

        return true;
    }
    public static void main(String[] args){
        // ---Results---]
        System.out.println(isIsomorphic("abcabc", "xyzxyz") + " expected true");
        System.out.println(isIsomorphic("add", "egg") + " expected true");
        System.out.println(isIsomorphic("abcd", "aabb") + " expected false");

    }

}
