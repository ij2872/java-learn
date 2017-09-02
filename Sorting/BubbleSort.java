package Sorting;

/**
 * Created by Ivan
 * Write a method that takes in an array of ints and uses the Bubble Sort algorithm to sort the array 'in place' in ascending order.
 * The method should return the same, in-place sorted array.
 */
public class BubbleSort {

    public static int[] bubbleSortArray(int[] arr){
        boolean hasSwapped = false;

        if(arr.length < 2){
            return arr;
        }

        for(int i = 1; i < arr.length; i++){

            if(arr[i - 1] > arr[i]){
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                hasSwapped = true;
            }
        }
        if(hasSwapped == true){
            bubbleSortArray(arr);
        }

        return arr;
    }
}
