package FireCodeIo;

import java.util.Arrays;

/**
 * Created by Ivan on 9/8/2017.
 */
public class mergeTwoSortedArrays {
    public static int[] merge(int[] arrLeft, int[] arrRight){


        int totalNums = arrLeft.length + arrRight.length;
        int resultIndex = 0;
        int[] result = new int[totalNums];

        int leftLength = arrLeft.length;
        int i = 0;

        int rightLength = arrRight.length;
        int j = 0;


        while(i < leftLength && j < rightLength){
            if(arrLeft[i] < arrRight[j]){
                result[resultIndex] = arrLeft[i];
                i++;
                resultIndex++;
            } else {
                result[resultIndex] = arrRight[j];
                j++;
                resultIndex++;
            }
        }

        // Add remainder of left or right

        while( i < leftLength){
            result[resultIndex] = arrLeft[i];
            resultIndex++;
            i++;
        }


        while(j < rightLength){


            result[resultIndex] = arrRight[j];
            resultIndex++;
            j++;
        }



        return result;

    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(merge(new int[]{2,5,7,8}, new int[]{2,4,7,12,32})));
    }
}
