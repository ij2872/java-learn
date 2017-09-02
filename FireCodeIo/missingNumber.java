package FireCodeIo;

import java.util.Arrays;

/**
 * Created by Ivan on 9/2/2017.
 */
public class missingNumber {

    public static int missingNumber(int[] arr){
        int expectedValue = (10 * (10+1)) / 2;
        int arrSum = 0;

        for(int a : arr){
            arrSum += a;
        }
        return expectedValue - arrSum;
    }

    public static void main(String[] args){

        // Returns 3
        missingNumber(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10});
    }
}
