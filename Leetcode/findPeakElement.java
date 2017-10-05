package Leetcode;

/**
 * Created by Ivan.
 */
public class findPeakElement {
    public static int findPeakElement(int[] nums) {
        int peak = nums[0];
        int i = 0;
        int peakIndex = 0;

        for(int n : nums){
            if(n > peak){
                peak = n;
                peakIndex = i;
            }
            i++;
        }
        System.out.println(peak);
        return 0;
    }

    public static void main(String[] args){
        findPeakElement(new int[]{1,2,3,1});
    }
}
