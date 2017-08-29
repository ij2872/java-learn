package Leetcode;

/**
 * Created by Ivan .
 */
public class singleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int i = 0; i<nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args){

    }
}
