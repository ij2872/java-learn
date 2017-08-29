package Leetcode;

/**
 * Created by Ivan.
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Input: [1,1,0,1,1,1]
 * Output: 3
 */
public class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for(int i : nums){
            current = (i == 0 ) ? 0 : current+1;
            max = Math.max(current, max);
        }
        return max;
    }
}
