package FireCodeIo;

/**
 * Created by Ivan on 9/2/2017.
 */
public class reverseInt {

    public static int reverseInt(int x){
        int result = 0;
        int xRemain = Math.abs(x);

        while (xRemain != 0){
            result = result * 10 + xRemain % 10;
            xRemain /= 10;
        }

        //test for negative x
        return x < 0 ? -result : result;
    }

    public static void main(String[] args){

        System.out.println(reverseInt(-123) + " expected -321");
        System.out.println(reverseInt(123) + " expected 321");
    }
}
