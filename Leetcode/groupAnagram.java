package Leetcode;

import sun.jvm.hotspot.utilities.HashtableBucket;

import java.util.*;

/**
 * Created by Ivan
 *  given: ["eat", "tea", "tan", "ate", "nat", "bat"]
 *  return: [
             ["ate", "eat","tea"],
             ["nat","tan"],
             ["bat"]
            ]
 */



public class groupAnagram {

    // Second Attempt. stores sorted strings in map as key. uses that key to get all strings associated with that key.
    public static List<List<String>> groupAnagrams2(String[] strs){
        List<List<String>> result = new ArrayList<>();

        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String s : strs){
            char[] sCharArray = s.toCharArray();

            Arrays.sort(sCharArray);
            String sSorted = new String(sCharArray);
            //add to map if not there
            if(!map.containsKey(sSorted)){
                map.put(sSorted, new ArrayList<String>());
            }
            map.get(sSorted).add(s);

        }

        map.forEach((k, v) ->{
            result.add(map.get(k));
        });

        return result;

    }

    // ___ ATTEMPT 1 ___ Does not work if two different strings add up to the same integer
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();


        //  stringSum, index
        Map<Integer, List<Integer>> map = new Hashtable<>();

        int i = 0;
        int stringMod = 0;


        for(String s : strs){
            for(char c : s.toCharArray()){
                stringMod += Character.getNumericValue(c) * 28;

            }

            List<Integer> indexHelper = new ArrayList<>();
            indexHelper = map.getOrDefault(stringMod, new ArrayList<Integer>(i));
            indexHelper.add(i);
            map.put(stringMod, indexHelper);
            stringMod = 0;
            i++;

        }


        map.forEach((k, v) -> {
            List<String> innerArray = new ArrayList<>();;
//            System.out.println(k + ": " + v );

            for(int j : v){
                innerArray.add(strs[j]);

            }
            result.add(innerArray);
        });


        return result;
    }

    public static void main(String[] args){
        List<List<String>> answer = new ArrayList<>();
        String[] test;

//        test = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        answer = groupAnagrams(test);
//
//        answer.forEach(System.out::println);
//        System.out.println();

        // duh:3,  ill:5
        test = new String[]{"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        answer =groupAnagrams2(test);
        answer.forEach(System.out::println);

    }
}
