package Leetcode;

/**
 * Created by Ivan.
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 *
 *Given two integers x and y, calculate the Hamming distance.
 *
 * input: x = 1, y = 4
 * Output: 2
 */
public class hammingDistance {
    public int hammingDistance(int x, int y) {
        int different = 0;
        // Or operator for differences
        int xyOr = x ^ y;

        while(xyOr != 0){
            different++;
            xyOr &= xyOr - 1;
        }

        return different;
    }
}
