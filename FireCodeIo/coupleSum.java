package FireCodeIo;

import java.util.HashMap;

/**
 * Created by Ivan on 9/13/2017.
 *
 * Given an array of integers, find two numbers such that they sum up to a specific target.
 The method coupleSum should return the indices of the two numbers in the array, where index1 must be less than index2.
 Please note that the indices are not zero based, and you can assume that each input has exactly one solution. Target linear runtime and space complexity.

 Example:
 Input Array : {2, 3, 4, 7}
 Target      : 7
 Output      : {2, 3}
 */
public class coupleSum {

    public static int[] coupleSum(int[] numbers, int target) {
        int[] result = new int[2];

        // current value, value needed
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 1;
        for(int number : numbers){
            map.put(target - number, i);
            i++;
        }

        for(int x = 0; x < numbers.length; x++){
            if(map.containsKey(numbers[x])){
                result[1] = map.get(numbers[x]);
                result[0] = x + 1;
                return result;
            }
        }

        return result;
    }
}
