package FireCodeIo;

/**
 * Created by Ivan
 */
public class binarySearch {
    public static Boolean binarySearch(int[] arr, int n){
//      {2,5,7,8,9,12}
        if(arr.length == 0) return false;
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            int mid = (start + (end)) / 2;
            if(arr[mid] == n){
                return true;
            }
            // Search to the right
            else if(n > arr[mid]){
                start = mid + 1;


            }
            //search to the left
            else {
                end = mid - 1;
            }


        }

        return false;
    }
}
