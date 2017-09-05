package FireCodeIo;

import java.util.HashSet;

/**
 * Created by Ivan
 * Check if all characters in a string are unique
 * return true if str == null
 */
public class areAllCharactersUnique {

    public static boolean areAllCharactersUnique(String str){
        if(str == null) return true;
        HashSet strSet = new HashSet();

        for(char s : str.toCharArray()){
            strSet.add(s);
        }

        return strSet.size() == str.length();

    }
}
