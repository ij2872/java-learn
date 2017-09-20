package FireCodeIo;

/**
 * Created by Ivan on 9/20/2017.
 */
public class isIntPalindrome {

    public static boolean isIntPalindrome(int x) {
        if(x < 0) return false;
        if(x <= 0 || x < 10) return true;


        int reverse = 0;
        int xbit = x;

        // solve with bit operator
        while(xbit != 0){
            reverse *= 10;
            reverse += xbit % 10;
            xbit /= 10;
            System.out.println(reverse);
        }
        if(reverse == x) return true;

        return false;

    }
    public static void main(String args[]){

        System.out.println(isIntPalindrome(1221));
    }
}
