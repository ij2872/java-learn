package FireCodeIo;

/**
 * Created by Ivan on 9/20/2017.
 */
public class validateBinaryTree {
    public static boolean validateBST(TreeNode root) {

        return isValid(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);


        // Attempt 1
        // if(root == null) return true;

        // //Check left
        // if(!validateBST(root.left)) return false;

        // if(last != null && root.data <= last){
        //     return false;
        // }
        // last = root.data;

        // //Check right
        // if(!validateBST(root.right)){
        //     return false;
        // }
        // return true;
    }

    public static boolean isValid(TreeNode n, double min, double max){
        if(n == null) return true;

        if(n.data <= min || n.data >= max){
            return false;
        }
        return isValid(n.left, min, n.data) && isValid(n.right, n.data, max);
    }
}
